/*
=====================================================================================================
*	FileName	:	GreetingRepository.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Sunday, 06 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.services;

/**
 *  Defines common behaviors for the greeting repository .
 */
public interface GreetingRepository
{
    public String getEnglishGreeting();

    public String getSpanishGreeting();

    public String getGermanGreeting();
}
