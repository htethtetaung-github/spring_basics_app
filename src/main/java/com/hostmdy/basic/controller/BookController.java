package com.hostmdy.basic.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hostmdy.basic.entity.Book;
import com.hostmdy.basic.repository.BookRepository;



@Controller
public class BookController {
	
	private BookRepository bookRepository;
	
	
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}



	@RequestMapping("/books")
	private String getBookList(Model model) {
	List<Book> books =(List<Book>)bookRepository.findAll();
	model.addAttribute("books",books);
	return "book-list";
	}

}
