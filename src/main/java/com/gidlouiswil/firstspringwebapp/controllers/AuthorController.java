/*
=====================================================================================================
*	FileName	:	AuthorController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Wednesday, 02 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.controllers;

import com.gidlouiswil.firstspringwebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  A class that handles requests related to instances of the Author class.
 */
@Controller
public class AuthorController
{
    /**
     *  This variable performs all CRUD operations related to the instances of the Author class.
     */
    private AuthorRepository author_repository;

    /**
     *  Creates a new AuthorController with the given author repository.
     *	@param author_repository the new author repository.
     */
    public AuthorController(AuthorRepository author_repository)
    {
        this.author_repository = author_repository;
    }

    /**
     *  Adds to the model an attribute that has as value the list of all authors stored in the database
     *  and returns the name of the view associated to the « /authors » url .
     *  @param model the Model object.
     *  @return the name of the view associated to the « /authors » url.
     */
    @RequestMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", author_repository.findAll());

        return "authors";
    }
}
