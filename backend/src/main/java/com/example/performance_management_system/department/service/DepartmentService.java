package com.example.performance_management_system.department.service;

import com.example.performance_management_system.department.model.Department;
import com.example.performance_management_system.department.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department create(Department department) {
        return repository.save(department);
    }

    public Department get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }
}

