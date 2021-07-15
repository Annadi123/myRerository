package com.team.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.team.model.Employee;
import com.team.repository.EmployeeRepository;

@RestController
@EntityScan("com.team")
@EnableJpaRepositories("com.team.repository")
public class EmployeeController {

	@Autowired
	private com.team.repository.EmployeeRepository employeeRepository;
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	@GetMapping("/")
	public List<Employee> listUser() {
		return employeeRepository.findAll();
	}

	@PostMapping("/add")
	public Employee saveUser(@RequestBody Employee user) {
		return employeeRepository.save(user);
	}

	@GetMapping("/show/{id}")
	public Employee getOneUSer(@PathVariable Long id) {
		return employeeRepository.findById(id).get();
	}

	@GetMapping("/users")
	public Employee getUserDetails(@RequestParam(required = true) Long uname) {
		return employeeRepository.findById(uname).get();

	}
	
	@PutMapping("/show/{id}")
	public Employee editUser(@PathVariable Long id) {
		return employeeRepository.findById(id).get();
	}
}
