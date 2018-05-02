/*
=====================================================================================================
*	FileName	:	AuthorRepository.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Tuesday, 01 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/

package com.gidlouiswil.firstspringwebapp.repositories;

import com.gidlouiswil.firstspringwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *  An interface that performs all CRUD operations related to the instances of the Author class.
 */
public interface AuthorRepository extends CrudRepository<Author, Long>
{
}
