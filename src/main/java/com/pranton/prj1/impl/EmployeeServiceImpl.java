package com.pranton.prj1.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pranton.prj1.entity.Employee;
import com.pranton.prj1.repository.EmployeeRepo;
import com.pranton.prj1.service.EmployeeService;

/**
 * EmployeeServiceImpl
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        // TODO Auto-generated method stub
        employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        // TODO Auto-generated method stub
        return employeeRepo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        // TODO Auto-generated method stub
        Employee existingEmployee = employeeRepo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());
        return employeeRepo.save(existingEmployee);
    }

    
}