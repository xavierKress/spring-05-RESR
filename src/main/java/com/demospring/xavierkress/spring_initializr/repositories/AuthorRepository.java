package com.demospring.xavierkress.spring_initializr.repositories;

import com.demospring.xavierkress.spring_initializr.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    //@Override
    //List<Author> findAll();
}
