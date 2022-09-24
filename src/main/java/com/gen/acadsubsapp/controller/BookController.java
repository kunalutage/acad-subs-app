package com.gen.acadsubsapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gen.acadsubsapp.dto.BookDto;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

	@GetMapping
	public ResponseEntity<List<BookDto>> getBooks() {
		BookDto bookDto = BookDto.builder().title("This is the title").build();
		List<BookDto> bookDtoList = new ArrayList<>();
		bookDtoList.add(bookDto);
		return ResponseEntity.ok(bookDtoList);		
	}
}
