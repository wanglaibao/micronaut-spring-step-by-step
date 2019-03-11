package com.laibao.micronaut.spring.app.repository;

import com.laibao.micronaut.spring.app.domain.Book;
import org.springframework.data.repository.CrudRepository;
public interface BookRepository extends CrudRepository<Book, Long> {
}
