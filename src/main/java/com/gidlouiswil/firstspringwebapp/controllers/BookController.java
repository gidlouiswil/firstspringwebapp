/*
=====================================================================================================
*	FileName	:	BookController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Wednesday, 02 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.controllers;

import com.gidlouiswil.firstspringwebapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  A class that handles requests related to instances of the Book class.
 */
@Controller
public class BookController
{
    /**
     *  This variable performs all CRUD operations related to the instances of the Book class.
     */
    private BookRepository book_repository;

    /**
     *  Creates a new BookController with the given book repository.
     *	@param book_repository the new book repository.
     */
    public BookController(BookRepository book_repository)
    {
        this.book_repository = book_repository;
    }

    /**
     *  Adds to the model an attribute that has as value the list of all books stored in the database
     *  and returns the name of the view associated to the « /books » url .
     *  @param model the Model object.
     *  @return the name of the view template associated to the « /books » url.
     */
    @RequestMapping("/books")
    public String getBooks(Model model)
    {
        model.addAttribute("books", book_repository.findAll());

        return "books";
    }
}
