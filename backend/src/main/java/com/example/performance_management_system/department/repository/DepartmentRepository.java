package com.example.performance_management_system.department.repository;


import com.example.performance_management_system.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
