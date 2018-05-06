/*
=====================================================================================================
*	FileName	:	GreetingServiceImplementation.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.services;

import org.springframework.stereotype.Service;

/**
 *  An implementation of the GreetingService interface.
 */
@Service
public class GreetingServiceImplementation implements GreetingService
{
    /**
     *  The greeting.
     */
    public static final String GREETING_SERVICE_IMPLEMENTATION = "Greeting Service Implementation";

    /**
     *  Returns a greeting.
     *  @return a greeting.
     */
    public String sayGreeting()
    {
        return GREETING_SERVICE_IMPLEMENTATION;
    }
}
