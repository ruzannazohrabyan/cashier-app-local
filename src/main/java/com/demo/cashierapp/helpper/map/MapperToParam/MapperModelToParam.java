package com.demo.cashierapp.helpper.map.MapperToParam;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.service.EmployeeParams;

public interface MapperModelToParam {

    public EmployeeParams modelToParam(EmployeeCreateRequestModel employeeCreateRequestModel);
}
