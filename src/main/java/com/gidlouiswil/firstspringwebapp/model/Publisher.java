/*
=====================================================================================================
*	FileName	:	Publisher.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 21 April 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  A class that represents a publisher.
 */
@Entity
public class Publisher
{
    /**
     *  The identifier of a publisher.This identifier must be unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     *  The name of a publisher.
     */
    private String name;

    /**
     *  The address of a publisher.
     */
    private String address;

    /**
     *  Creates a new Publisher with no name, no address.
     */
    public Publisher()
    {

    }

    /**
     *  Creates a new Publisher with the given name and the given address.
     *  @param name the name of the publisher.
     *	@param address the address of the publisher.
     */
    public Publisher(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    /**
     *  Returns the name of the publisher.
     */
    public String getName()
    {
        return name;
    }

    /**
     *  Sets the name of the publisher to the given value.
     *  @param name the new name of the publisher.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *  Returns the address of the publisher.
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *  Sets the address of the publisher to the given value.
     *  @param address the new address of the publisher.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     *  Returns the identifier of the publisher.
     */
    public Long getId()
    {
        return id;
    }
}
