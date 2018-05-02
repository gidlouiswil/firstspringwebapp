/*
=====================================================================================================
*	FileName	:	BookRepository.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Tuesday, 01 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.repositories;

import com.gidlouiswil.firstspringwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *  An interface that performs all CRUD operations related to the instances of the Book class.
 */
public interface BookRepository extends CrudRepository<Book, Long>
{
}
