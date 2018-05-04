/*
=====================================================================================================
*	FileName	:	FirstSpringWebApplication.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Friday, 04 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.firstspringwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  A class that launches the application.
 */
@SpringBootApplication
public class FirstSpringWebApplication
{

    /**
     *  Starts the execution of the application.
     *	@param args the arguments with which the application will be loaded.
     */
	public static void main(String[] args)
	{
		SpringApplication.run(FirstSpringWebApplication.class, args);
	}
}
