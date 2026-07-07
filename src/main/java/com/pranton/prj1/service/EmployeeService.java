package com.pranton.prj1.service;

import java.util.List;

import com.pranton.prj1.entity.Employee;

/**
 * InnerEmployeeService
 */
public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}