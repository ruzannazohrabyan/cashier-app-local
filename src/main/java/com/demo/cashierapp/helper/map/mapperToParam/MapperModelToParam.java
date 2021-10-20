package com.demo.cashierapp.helper.map.mapperToParam;

import com.demo.cashierapp.model.CreateEmployeeRequestModel;
import com.demo.cashierapp.model.CreateEmployeeParams;

public interface MapperModelToParam {

    public CreateEmployeeParams modelToParam(CreateEmployeeRequestModel createEmployeeRequestModel);
}
