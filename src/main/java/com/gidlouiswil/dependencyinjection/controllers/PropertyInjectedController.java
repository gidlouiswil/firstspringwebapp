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

/**
 *  A class used to show dependency injection by using a public property.
 */
public class PropertyInjectedController
{
    /**
     *  The GreetingService.
     */
    public GreetingServiceImplementation greeting_service_impl;

    /**
     *  Returns a greeting.
     *  @return a greeting.
     */
    String sayGreeting()
    {
        return greeting_service_impl.sayGreeting();
    }
}
