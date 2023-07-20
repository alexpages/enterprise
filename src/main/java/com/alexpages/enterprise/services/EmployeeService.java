package com.alexpages.enterprise.services;

import com.alexpages.enterprise.models.Employee;
import com.alexpages.enterprise.models.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    //GET
    public Optional<Employee> findEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

    //PUT
    public Employee registerNewEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    //DELETE
    public void deleteEmployee(Employee employee){
        employeeRepository.delete(employee);
    }
}
