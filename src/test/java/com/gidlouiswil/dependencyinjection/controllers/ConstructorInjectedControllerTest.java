/*
=====================================================================================================
*	FileName	:	ConstructorInjectedControllerTest.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.controllers;

import com.gidlouiswil.dependencyinjection.services.GreetingServiceImplementation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  A test class of the ConstructorInjectedController class.
 */
public class ConstructorInjectedControllerTest
{
    private ConstructorInjectedController constructor_injected_controller;

    @Before
    public void setUp() throws Exception
    {
        this.constructor_injected_controller = new ConstructorInjectedController(new GreetingServiceImplementation());
    }

    @Test
    public void testSayGreeting() throws Exception
    {
        assertEquals(GreetingServiceImplementation.GREETING_SERVICE_IMPLEMENTATION,
                constructor_injected_controller.sayGreeting());
    }
}
