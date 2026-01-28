package com.example.performance_management_system.department.controller;


import com.example.performance_management_system.department.model.Department;
import com.example.performance_management_system.department.service.DepartmentService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
@PreAuthorize("hasRole('HR') or hasRole('ADMIN')")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department create(@RequestBody Department dept) {
        return service.create(dept);
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable Long id) {
        return service.get(id);
    }
}
