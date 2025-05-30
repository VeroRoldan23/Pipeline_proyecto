package com.example.employees.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.employees.entidades.Employee;

@RestController 

public class RestEmployeesController {
    
    private static final List<Employee> employees = new ArrayList<>();
    
    static {
        employees.add(new Employee(1L, "Carlos", "Villa", "Desarrollador"));
        employees.add(new Employee(2L, "Angel ", "Chaverra ", "Desarrollador"));
    }

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }
    
    @GetMapping("/employees")
    public List<Employee> employees() {
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/employees/name/{name}")
    public Employee getEmployeeByName(@PathVariable String name) {
        return employees.stream()
            .filter(employee -> employee.getName().equalsIgnoreCase(name))
            .findFirst()
            .orElse(null);
}
    
    
}
