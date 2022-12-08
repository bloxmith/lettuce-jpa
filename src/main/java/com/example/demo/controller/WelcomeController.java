package com.example.demo.controller;

import com.example.demo.entity.Someone;
import com.example.demo.repository.SomeoneRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author p@bloxmith.com
 */
@RestController
@RequestMapping("/someone")
public class WelcomeController {

	@Autowired
	private SomeoneRepository someoneRepository;

	@GetMapping("/")
	List<Someone> index() {
		return someoneRepository.findAll();
	}

	@GetMapping("/{id}")
	Someone get(Integer id) {
		return someoneRepository.findById(id).orElseThrow();
	}
}
