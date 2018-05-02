/*
=====================================================================================================
*	FileName	:	DevBootstrap.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Tuesday, 01 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.bootstrap;

import com.gidlouiswil.firstspringwebapp.model.Author;
import com.gidlouiswil.firstspringwebapp.model.Book;
import com.gidlouiswil.firstspringwebapp.model.Publisher;
import com.gidlouiswil.firstspringwebapp.repositories.AuthorRepository;
import com.gidlouiswil.firstspringwebapp.repositories.BookRepository;
import com.gidlouiswil.firstspringwebapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>
{
    /**
     *  This variable performs all CRUD operations related to the instances of the Author class.
     */
    private AuthorRepository author_repository;

    /**
     *  This variable performs all CRUD operations related to the instances of the Book class.
     */
    private BookRepository book_repository;

    /**
     *  This variable performs all CRUD operations related to the instances of the Publisher class.
     */
    private PublisherRepository publisher_repository;

    /**
     *  Creates a new DevBootstrap with the given author repository,the given book repository and the given publisher repository.
     *  @param author_repository the new author repository.
     *	@param book_repository the new book repository.
     *  @param publisher_repository the new publisher repository.
     */
    public DevBootstrap(AuthorRepository author_repository, BookRepository book_repository, PublisherRepository publisher_repository)
    {
        this.author_repository = author_repository;
        this.book_repository = book_repository;
        this.publisher_repository = publisher_repository;
    }

    /**
     *  This method is executed when the ContextRefreshedEvent occurs.
     *  @param contextRefreshedEvent the event that occurs when the context is refreshed.
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
        initData();
    }

    /**
     *  Creates new records in the database.
     */
    private void initData()
    {
        Publisher publisher = new Publisher();
        publisher.setName("Louis Wilfried");

        publisher_repository.save(publisher);

       Author louis = new Author("Louis", "Mbog");
       Book book1 =  new Book("La Sainte Bible", "1234", publisher);
       louis.getBooksSet().add(book1);

       author_repository.save(louis);
       book_repository.save(book1);

       Author wilfried = new Author("Wilfried", "Mbog");
       Book book2 =  new Book("The Holy Bible", "5678", publisher);
       wilfried.getBooksSet().add(book2);

       author_repository.save(wilfried);
       book_repository.save(book2);
    }
}
