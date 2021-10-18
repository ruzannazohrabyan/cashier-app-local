package com.demo.cashierapp.helpper.map.MapperToRequestModel;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.service.EmployeeParams;

public interface MapperModelToRequestModel {

    public EmployeeCreateRequestModel modelToRequest(EmployeeParams employeeParams);

}
