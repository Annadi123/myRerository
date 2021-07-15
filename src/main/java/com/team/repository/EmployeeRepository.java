package com.team.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public Optional<Employee> findByUname(String user_name);
}
