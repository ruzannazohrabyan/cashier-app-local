package com.demo.cashierapp.helper.map.mapperToParam;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.service.EmployeeParams;

public interface MapperModelToParam {

    public EmployeeParams modelToParam(EmployeeCreateRequestModel employeeCreateRequestModel);
}
