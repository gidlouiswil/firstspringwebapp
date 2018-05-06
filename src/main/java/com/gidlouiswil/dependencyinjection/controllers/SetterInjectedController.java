/*
=====================================================================================================
*	FileName	:	SetterInjectedController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.controllers;

import com.gidlouiswil.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *  A class used to show dependency injection by using a setter.
 */
@Controller
public class SetterInjectedController
{
    /**
     *  The GreetingService.
     */
    private GreetingService greeting_service;

    /**
     *  Returns a greeting.
     *  @return a greeting.
     */
    public String sayGreeting()

    {
        return greeting_service.sayGreeting();
    }

    /**
     *  Set the « greeting_service » property with the given value.
     *  @param greeting_service the new GreetingService.
     */
    @Autowired
    public void setGreetingService(GreetingService greeting_service)
    {
        this.greeting_service = greeting_service;
    }
}
