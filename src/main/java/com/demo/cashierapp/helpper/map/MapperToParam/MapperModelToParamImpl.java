package com.demo.cashierapp.helpper.map.MapperToParam;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.service.EmployeeParams;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class MapperModelToParamImpl implements MapperModelToParam{

    private final EmployeeParams employeeParams;

    @Override
    public  EmployeeParams modelToParam(EmployeeCreateRequestModel employeeCreateRequestModel){

        employeeParams.setFirstName(employeeCreateRequestModel.getFirstName());
        employeeParams.setLastName(employeeCreateRequestModel.getLastName());
        employeeParams.setPassword(employeeCreateRequestModel.getPassword());
        employeeParams.setUsername(employeeCreateRequestModel.getUsername());

        return employeeParams;
    }
}
