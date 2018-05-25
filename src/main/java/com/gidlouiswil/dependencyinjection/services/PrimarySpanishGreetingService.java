/*
=====================================================================================================
*	FileName	:	PrimarySpanishGreetingService.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Sunday, 06 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *  An implementation of the GreetingService interface.
 */
/*@Service
@Primary
@Profile("es")*/
public class PrimarySpanishGreetingService implements GreetingService
{
    private GreetingRepository  greeting_repository;

    public PrimarySpanishGreetingService(GreetingRepository  greeting_repository)
    {
        this.greeting_repository = greeting_repository;
    }

    /**
     *  Returns a greeting.
     *  @return a greeting.
     */

    @Override
    public String sayGreeting()
    {
        return greeting_repository.getSpanishGreeting();
    }
}