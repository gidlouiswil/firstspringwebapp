/*
=====================================================================================================
*	FileName	:	DependencyInjectionApplication.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 05 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection;

import com.gidlouiswil.dependencyinjection.controllers.DependencyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *  A class that launches the application.
 */
@SpringBootApplication
public class DependencyInjectionApplication
{
    /**
     *  Starts the execution of the application.
     *	@param args the arguments with which the application will be loaded.
     */
	public static void main(String[] args)
	 {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
         DependencyInjectionController controller = (DependencyInjectionController)context.getBean("dependencyInjectionController");
         controller.sayDependencyInjectionController();
	}
}
