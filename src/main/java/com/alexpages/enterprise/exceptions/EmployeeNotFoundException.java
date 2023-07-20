package com.alexpages.enterprise.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String errorMessage) {
        super(errorMessage);
    }

}
