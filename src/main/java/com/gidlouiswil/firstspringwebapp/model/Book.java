/*
=====================================================================================================
*	FileName	:	Book.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 21 April 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.model;

import javax.persistence.*;
import java.util.Set;

/**
 *  A class that represents a book.
 */
@Entity
public class Book
{
    /**
     *  The identifier of a book.This identifier must be unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     *  The title of a book.
     */
    private String title;

    /**
     *  The ISBN of a book.
     */
    private String isbn;

    /**
     *  The name of the publisher of a book.
     */
    private String publisher;

    /**
     *  The set of authors of a book.
     */
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors_set;

    /**
     *  Creates a new Book with no title, no ISBN, no publisher, no set of authors.
     */
    public Book()
    {

    }

    /**
     *  Creates a new Book with the given title, the given ISBN, the given publisher.
     *  @param title the title of the book.
     *	@param isbn the ISBN of the book.
     *  @param publisher the publisher of the book.
     */
    public Book(String title, String isbn, String publisher)
    {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    /**
     *  Creates a new Book with the given title, the given ISBN, the given publisher, the given set of authors.
     *  @param title the title of the book.
     *	@param isbn the ISBN of the book.
     *  @param publisher the publisher of the book.
     *  @param authorz_set the set of authors of the book.
     */
    public Book(String title, String isbn, String publisher, Set<Author> authorz_set)
    {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors_set = authors_set;
    }

    /**
     *  Returns the title of the book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     *  Sets the title of the book to the given value.
     *  @param title the new title of the book.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     *  Returns the ISBN of the book.
     */
    public String getIsbn()
    {
        return isbn;
    }

    /**
     *  Sets the ISBN of the book to the given value.
     *  @param isbn the new ISBN of the book.
     */
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    /**
     *  Returns the publisher of the book.
     */
    public String getPublisher()
    {
        return publisher;
    }

    /**
     *  Sets the publisher of the book to the given value.
     *  @param publisher the new publisher of the book.
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    /**
     *  Returns the set of authors of the book.
     */
    public Set<Author> getAuthorsSet() {
        return authors_set;
    }

    /**
     *  Sets the set of authors of the book to the given value
     *  @param authors_set the new set of authors of the book.
     */
    public void setAuthorsSet(Set<Author> authors_set)
    {
        this.authors_set = authors_set;
    }
}
