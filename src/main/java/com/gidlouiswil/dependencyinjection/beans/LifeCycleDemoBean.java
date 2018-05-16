/*
=====================================================================================================
*	FileName	:	LifeCycleDemoBean.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Tuesday, 15 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *  A class that represents a bean.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware
{
    public LifeCycleDemoBean()
    {
        System.out.println("I'm in the LifeCycleDemoBean constructor.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("The Bean Factory has been set.");
    }

    @Override
    public void setBeanName(String name)
    {
        System.out.println("My Bean name is: " + name);
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("The LifeCycleDemoBean has been terminated.");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("The LifeCycleDemoBean has its properties set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println("The Application Context has been set.");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("The Pre Destroy annotated method has been called");
    }

    public void beforeInit()
    {
        System.out.println(" - Before Init - Called by Bean Post Processor");
    }

    public void afterInit()
    {
        System.out.println(" - After Init - Called by Bean Post Processor");
    }
}
