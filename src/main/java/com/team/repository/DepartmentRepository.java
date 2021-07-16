package com.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.team.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
