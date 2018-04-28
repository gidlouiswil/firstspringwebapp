/*
=====================================================================================================
*	FileName	:	Author.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 21 April 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 *  A class that represents an author.
 */
@Entity
public class Author
{
    /**
     *  The identifier of an author.This identifier must be unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     *  The first name of an author.
     */
    private String first_name;

    /**
     *  The last name of an author.
     */
    private String last_name;

    /**
     *  The set of books written by an author.
     */
    private Set<Book> books_set;

    /**
     *  Creates a new Author with no first name, no last name, no publisher, no set of written books .
     */
    public Author()
    {

    }

    /**
     *  Creates a new Author with the given first name, the given last name.
     *  @param first_name the first name of the author.
     *	@param last_name the last name of the author.
     */
    public Author(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    /**
     *  Creates a new Author with the given first name, the given last name, the given set of written books.
     *  @param first_name the first name of the author.
     *	@param last_name the last name of the author.
     *  @param books_set the set of books written by the author.
     */
    public Author(String first_name, String last_name, Set<Book> books_set)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.books_set = books_set;
    }

    /**
     *  Returns the first name of the author.
     */
    public String getFirstName()
    {
        return first_name;
    }

    /**
     *  Sets the first name of the author to the given value.
     *  @param first_name the new first name of the author.
     */
    public void setFirstName(String first_name)
    {
        this.first_name = first_name;
    }

    /**
     *  Returns the last name of the author.
     */
    public String getLastName()
    {
        return last_name;
    }

    /**
     *  Sets the last name of the author to the given value.
     *  @param last_name the new last name of the author.
     */
    public void setLastName(String last_name)
    {
        this.last_name = last_name;
    }

    /**
     *  Returns the set of books written by the author.
     */
    public Set<Book> getBooksSet()
    {
        return books_set;
    }

    /**
     *  Sets the set of books written by the author to the given value.
     *  @param books_set the new set of books written by the author.
     */
    public void setBooksSet(Set<Book> books_set)
    {
        this.books_set = books_set;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public String toString()
    {
        return "Author{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", books_set=" + books_set +
                '}';
    }
}
