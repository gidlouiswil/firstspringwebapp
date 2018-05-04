/*
=====================================================================================================
*	FileName	:	PublisherController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Wednesday, 02 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.firstspringwebapp.controllers;

import com.gidlouiswil.firstspringwebapp.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  A class that handles requests related to instances of the Publisher class.
 */
@Controller
public class PublisherController
{
    /**
     *  This variable performs all CRUD operations related to the instances of the Publisher class.
     */
    private PublisherRepository publisher_repository;

    /**
     *  Creates a new PublisherController with the given publisher repository.
     *	@param publisher_repository the new publisher repository.
     */
    public PublisherController(PublisherRepository publisher_repository)
    {
        this.publisher_repository = publisher_repository;
    }

    /**
     *  Adds to the model an attribute that has as value the list of all publishers stored in the database
     *  and returns the name of the view associated to the « /books » url .
     *  @param model the Model object.
     *  @return the name of the view template associated to the « /publishers » url.
     */
    @RequestMapping("/publishers")
    public String getPublishers(Model model)
    {
        model.addAttribute("publishers", publisher_repository.findAll());

        return "publishers";
    }
}
