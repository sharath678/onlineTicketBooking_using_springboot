package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MovieController {

	@Autowired
	private BookingRepository br;
	
	@PostMapping("/add")
	public <S extends BookingHistory> S save(@RequestBody S entity) {
		return br.save(entity);
	}
	
	@GetMapping("/get/page/sort")
	public List<BookingHistory> findAll(Sort sort) {
		return br.findAll(sort);
	}

	@GetMapping("/get/page")
	public Page<BookingHistory> findAll(Pageable pageable) {
		return br.findAll(pageable);
	}

	@GetMapping("/get")
	public List<BookingHistory> findAll() {
		return br.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<BookingHistory> findById(@PathVariable("id") Integer category_id) {
		return br.findById(category_id);
	}

	@PutMapping("/get/{id}")
	public BookingHistory updateById(@PathVariable("id") Integer category_id, @RequestBody BookingHistory c) {
		return br.save(c);
	}

	@DeleteMapping("/get/{id}")
	public void deleteById(@PathVariable("id") Integer category_id) {
		br.deleteById(category_id);
	}
}
