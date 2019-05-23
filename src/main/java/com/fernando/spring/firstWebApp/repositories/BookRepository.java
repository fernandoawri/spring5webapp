package com.fernando.spring.firstWebApp.repositories;

import com.fernando.spring.firstWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}