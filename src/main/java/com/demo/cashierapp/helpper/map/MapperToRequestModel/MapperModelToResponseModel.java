package com.demo.cashierapp.helpper.map.MapperToRequestModel;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.model.EmployeeDetailsResponseModel;
import com.demo.cashierapp.service.EmployeeParams;

public interface MapperModelToResponseModel {

    EmployeeDetailsResponseModel modelToResponse(Employee employee);

}
