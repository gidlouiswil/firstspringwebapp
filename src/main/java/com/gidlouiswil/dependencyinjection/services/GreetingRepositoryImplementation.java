/*
=====================================================================================================
*	FileName	:	GreetingRepositoryImplementation.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Sunday, 06 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.services;

import org.springframework.stereotype.Component;

/**
 *  An implementation of the GreetingRepository interface.
 */
@Component
public class GreetingRepositoryImplementation implements GreetingRepository
{
    /**
     *  Returns an english greeting.
     *  @return an english greeting.
     */
    @Override
    public String getEnglishGreeting()
    {
        return "Hello - Primary Greeting service";
    }

    /**
     *  Returns a spanish greeting.
     *  @return a spanish greeting.
     */
    @Override
    public String getSpanishGreeting()
    {
        return "Servicio de Saludo Primario";
    }

    /**
     *  Returns a german greeting.
     *  @return a german greeting.
     */
    @Override
    public String getGermanGreeting()
    {
        return "Primärer GruBdienst";
    }
}
