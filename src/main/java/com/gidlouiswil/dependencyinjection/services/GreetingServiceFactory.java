/*
=====================================================================================================
*	FileName	:	GreetingServiceFactory.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Friday, 25 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.services;

/**
 *  A class that creates a greeting service that matches the language of the application.
 */
public class GreetingServiceFactory
{
    /**
     *  The greeting repository.
     */
    private GreetingRepository greeting_repository;

    /**
     *  Creates a GreetingServiceFactory with the specified greeting repository.
     *  @param greeting_repository the specified greeting repository.
     */
    public GreetingServiceFactory(GreetingRepository greeting_repository)
    {
        this.greeting_repository = greeting_repository;
    }

    /**
     *  Creates and return a GreetingService that matches the language of the application.
     *  @param language the language of the application.
     *  @return a GreetingService that matches the language of the application.
     */
    public GreetingService createGreetingService(String language)
    {
        switch (language)
        {
            case "en":
                return new PrimaryGreetingService(greeting_repository);
            case "de":
                return new PrimaryGermanGreetingService(greeting_repository);
            case "es":
                return new PrimarySpanishGreetingService(greeting_repository);
            default:
                return new PrimaryGreetingService(greeting_repository);
        }
    }
}
