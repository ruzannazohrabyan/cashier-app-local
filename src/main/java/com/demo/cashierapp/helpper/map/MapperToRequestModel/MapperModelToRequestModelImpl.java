package com.demo.cashierapp.helpper.map.MapperToRequestModel;

import com.demo.cashierapp.model.EmployeeCreateRequestModel;
import com.demo.cashierapp.service.EmployeeParams;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class MapperModelToRequestModelImpl implements MapperModelToRequestModel {

    private final EmployeeCreateRequestModel employeeCreateRequestModel;

    @Override
    public EmployeeCreateRequestModel modelToRequest(EmployeeParams employeeParams) {
        employeeCreateRequestModel.setFirstName(employeeParams.getFirstName());
        employeeCreateRequestModel.setLastName(employeeParams.getLastName());
        employeeCreateRequestModel.setUsername(employeeParams.getUsername());
        employeeCreateRequestModel.setPassword(employeeParams.getPassword());

        return employeeCreateRequestModel;

    }
}
