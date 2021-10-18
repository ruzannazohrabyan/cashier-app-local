package com.demo.cashierapp.controller;

import com.demo.cashierapp.apiService.EmployeeApiService;
import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.model.EmployeeDetailsResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeApiService employeeApiService;

    @PostMapping
    public EmployeeDetailsResponseModel save(@RequestBody EmployeeCreateRequestModel employeeModel) {
        return employeeApiService.create(employeeModel);
    }
}
