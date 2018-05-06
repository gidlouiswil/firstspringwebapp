/*
=====================================================================================================
*	FileName	:	PropertyInjectedController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.controllers;

import com.gidlouiswil.dependencyinjection.services.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *  A class used to show dependency injection by using a public property.
 */
@Controller
public class PropertyInjectedController
{
    /**
     *  The GreetingService.
     */
    @Autowired
    public GreetingServiceImplementation greeting_service_impl;

    /**
     *  Returns a greeting.
     *  @return a greeting.
     */
    public String sayGreeting()
    {
        return greeting_service_impl.sayGreeting();
    }
}
