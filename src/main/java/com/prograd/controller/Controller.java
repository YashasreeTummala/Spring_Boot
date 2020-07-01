package com.prograd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prograd.dao.Dao;
import com.prograd.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class Controller {

	@Autowired
	private Dao employeeRepository;

//
	@GetMapping("/get")
	public List<Employee> getAllModles() {
		return employeeRepository.findAll();
//
	}

//

}
