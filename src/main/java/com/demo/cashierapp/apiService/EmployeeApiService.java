package com.demo.cashierapp.apiService;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.model.EmployeeDetailsResponseModel;

public interface EmployeeApiService {
    EmployeeDetailsResponseModel create(EmployeeCreateRequestModel employeeCreateModel);
}
