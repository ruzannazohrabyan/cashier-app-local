package com.demo.cashierapp.repository;

import com.demo.cashierapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findUserByUsername(String username);
}
