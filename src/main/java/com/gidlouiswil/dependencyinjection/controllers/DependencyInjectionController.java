/*
=====================================================================================================
*	FileName	:	DependencyInjectionController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 *  A dummy controller.
 */
@Controller
public class DependencyInjectionController
{
    public String sayHello()
    {
        System.out.println("Hello!!!");
        return "";
    }
}
