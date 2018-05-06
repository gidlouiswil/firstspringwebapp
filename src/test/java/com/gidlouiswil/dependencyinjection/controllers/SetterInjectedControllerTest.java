/*
=====================================================================================================
*	FileName	:	SetterInjectedControllerTest.
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
 *  A test class of the SetterInjectedController class.
 */
public class SetterInjectedControllerTest
{
    private SetterInjectedController setter_injected_controller;

    @Before
    public void setUp() throws Exception
    {
        this.setter_injected_controller = new SetterInjectedController();
        this.setter_injected_controller.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    public void testSayGreeting() throws Exception
    {
        assertEquals(GreetingServiceImplementation.GREETING_SERVICE_IMPLEMENTATION,
                setter_injected_controller.sayGreeting());
    }
}
