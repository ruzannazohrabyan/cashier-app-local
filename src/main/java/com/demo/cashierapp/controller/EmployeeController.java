package com.demo.cashierapp.controller;

import com.demo.cashierapp.apiService.employee.impl.EmployeeApiServiceImpl;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeRequestASM;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeResponseASM;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeApiServiceImpl employeeApiService;

    @PostMapping
    public CreateEmployeeResponseASM create(@RequestBody CreateEmployeeRequestASM createEmployeeRequestASM) {
        return employeeApiService.create(createEmployeeRequestASM);
    }
}
