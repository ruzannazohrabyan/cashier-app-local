package com.demo.cashierapp.helper.map.mapperToParam;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.service.EmployeeParams;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class MapperModelToParamImpl implements MapperModelToParam{


    @Override
    public  EmployeeParams modelToParam(EmployeeCreateRequestModel employeeCreateRequestModel){
        final EmployeeParams employeeParams = new EmployeeParams();

        employeeParams.setFirstName(employeeCreateRequestModel.getFirstName());
        employeeParams.setLastName(employeeCreateRequestModel.getLastName());
        employeeParams.setPassword(employeeCreateRequestModel.getPassword());
        employeeParams.setUsername(employeeCreateRequestModel.getUsername());

        return employeeParams;
    }
}
