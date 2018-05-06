/*
=====================================================================================================
*	FileName	:	PropertyInjectedControllerTest.
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
 *  A test class of the PropertyInjectedController class.
 */

public class PropertyInjectedControllerTest
{
    private PropertyInjectedController property_injected_controller;

    @Before
    public void setUp() throws Exception
    {
        this.property_injected_controller = new PropertyInjectedController();
        this.property_injected_controller.greeting_service_impl = new GreetingServiceImplementation();
    }

    @Test
    public void testSayGreeting() throws Exception
    {
        assertEquals(GreetingServiceImplementation.GREETING_SERVICE_IMPLEMENTATION,
                property_injected_controller.sayGreeting());
    }
}
