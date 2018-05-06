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

/**
 *  A dummy controller.
 */
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
    String sayGreeting()
    {
        return greeting_service.sayGreeting();
    }

    /**
     *  Set the « greeting_service » property with the given value.
     *  @param greeting_service the new GreetingService.
     */
    public void setGreetingService(GreetingService greeting_service)
    {
        this.greeting_service = greeting_service;
    }
}
