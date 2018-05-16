/*
=====================================================================================================
*	FileName	:	CustomBeanPostProcessor.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Sunday, 06 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.dependencyinjection.beanpostprocessors;

import com.gidlouiswil.dependencyinjection.beans.LifeCycleDemoBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *  A class that represents a custom bean post processor.
 */
public class CustomBeanPostProcessor implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        if(bean instanceof LifeCycleDemoBean)
        {
            ((LifeCycleDemoBean)bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        if(bean instanceof LifeCycleDemoBean)
        {
            ((LifeCycleDemoBean)bean).afterInit();
        }

        return bean;
    }
}
