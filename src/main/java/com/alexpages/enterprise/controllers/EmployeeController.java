package com.alexpages.enterprise.controllers;

import com.alexpages.enterprise.models.Employee;
import com.alexpages.enterprise.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PutMapping("/register")
    public Employee registerNewEmployee(Employee employee){
        return employeeService.registerNewEmployee(employee);
    }

    @GetMapping("/")
    public Optional<Employee> getEmployee(Long id){
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping("/delete")
    public Employee deleteEmployee(Employee employee){
        return employeeService.registerNewEmployee(employee);
    }





}
