/*
=====================================================================================================
*	FileName	:	GreetingServiceConfiguration.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Sunday, 06 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.configurations;

import com.gidlouiswil.dependencyinjection.services.GreetingRepository;
import com.gidlouiswil.dependencyinjection.services.GreetingService;
import com.gidlouiswil.dependencyinjection.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 *  The configuration related to the greeting services.
 */
@Configuration
public class GreetingServiceConfiguration
{
    /**
     *  Returns an instance of the GreetingServiceFactory class created with the specified greeting repository.
     *   @param greeting_repository the specified greeting repository.
     *	@return an instance of the GreetingServiceFactory class.
     */
    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greeting_repository)
    {
        return new GreetingServiceFactory(greeting_repository);
    }

    /**
     *  Returns a GreetingService that matches the english language.
     *   @param greeting_service_factory the specified greeting service factory.
     *	@return a GreetingService.
     */
    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greeting_service_factory)
    {
        return greeting_service_factory.createGreetingService("en");
    }

    /**
     *  Returns a GreetingService that matches the spanish language.
     *   @param greeting_service_factory the specified greeting service factory.
     *	@return a GreetingService.
     */
    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greeting_service_factory)
    {
        return greeting_service_factory.createGreetingService("es");
    }

    /**
     *  Returns a GreetingService that matches the deutsch language.
     *   @param greeting_service_factory the specified greeting service factory.
     *	@return a GreetingService.
     */
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greeting_service_factory)
    {
        return greeting_service_factory.createGreetingService("de");
    }
}
