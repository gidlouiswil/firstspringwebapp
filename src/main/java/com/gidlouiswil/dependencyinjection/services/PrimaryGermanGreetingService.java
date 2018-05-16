/*
=====================================================================================================
*	FileName	:	PrimaryGermanGreetingService.
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
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService
{
    private  GreetingRepository Greeting_repository;

    public PrimaryGermanGreetingService(GreetingRepository greeting_repository)
    {
        Greeting_repository = greeting_repository;
    }

    /**
     *  Returns a greeting.
     *  @return a greeting.
     */
    @Override
    public String sayGreeting()
    {
        return Greeting_repository.getGermanGreeting();
    }
}
