package com.hostmdy.basic.repository;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.basic.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	

}
