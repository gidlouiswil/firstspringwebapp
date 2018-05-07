/*
=====================================================================================================
*	FileName	:	DependencyInjectionController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.controllers;

import com.gidlouiswil.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 *  A dummy controller.
 */
@Controller
public class DependencyInjectionController
{
    private GreetingService greeting_service;

    public DependencyInjectionController(GreetingService greeting_service)
    {
        this.greeting_service = greeting_service;
    }

    /**
     *  Returns an empty string.
     *  @return an empty string.
     */
    public String sayDependencyInjectionController()
    {
        System.out.println("Dependency Injection Controller");
        return greeting_service.sayGreeting();
    }
}
