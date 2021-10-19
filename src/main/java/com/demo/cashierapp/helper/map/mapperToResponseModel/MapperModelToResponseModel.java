package com.demo.cashierapp.helper.map.mapperToResponseModel;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.model.EmployeeDetailsResponseModel;

public interface MapperModelToResponseModel {

    EmployeeDetailsResponseModel modelToResponse(Employee employee);

}
