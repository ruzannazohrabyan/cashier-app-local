package com.demo.cashierapp.controller;

import com.demo.cashierapp.api.service.employee.impl.EmployeeApiServiceImpl;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeRequestModel;
import com.demo.cashierapp.model.apiService.employee.CreateEmployeeResponseModel;
import com.demo.cashierapp.model.apiService.employee.EmployeeDetailsModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeApiServiceImpl employeeApiService;

    @PostMapping
    public CreateEmployeeResponseModel create(@RequestBody CreateEmployeeRequestModel createEmployeeRequestModel) {
        return employeeApiService.create(createEmployeeRequestModel);
    }

    @GetMapping
    public List<EmployeeDetailsModel> getAll() {
        return employeeApiService.getAll();
    }
}
