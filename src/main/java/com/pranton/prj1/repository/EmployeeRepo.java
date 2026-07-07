package com.pranton.prj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranton.prj1.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
}
