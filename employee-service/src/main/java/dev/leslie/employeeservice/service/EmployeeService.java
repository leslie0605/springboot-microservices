package dev.leslie.employeeservice.service;

import dev.leslie.employeeservice.dto.APIResponseDto;
import dev.leslie.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
