package com.alexpages.enterprise.services;

import com.alexpages.enterprise.exceptions.EmployeeNotFoundException;
import com.alexpages.enterprise.models.Employee;
import com.alexpages.enterprise.models.EmployeeDto;
import com.alexpages.enterprise.models.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    //GET
    public EmployeeDto findEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .map(employee -> new EmployeeDto().builder()
                        .id(employee.getId())
                        .birthDate(employee.getBirthDate())
                        .firstName(employee.getFirstName())
                        .lastName(employee.getLastName())
                        .build())
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with id: " + id + " not found"));
    }

    //PUT
    public Employee registerNewEmployee(EmployeeDto employeeDto){
        Employee employee = Employee.builder()
                .id(employeeDto.getId())
                .firstName(employeeDto.getFirstName())
                .lastName(employeeDto.getLastName())
                .birthDate(employeeDto.getBirthDate())
                .build();
        return employeeRepository.save(employee);
    }

    //DELETE
    public void deleteEmployee(EmployeeDto employeeDto){
        employeeRepository.deleteById(employeeDto.getId());
    }
}
