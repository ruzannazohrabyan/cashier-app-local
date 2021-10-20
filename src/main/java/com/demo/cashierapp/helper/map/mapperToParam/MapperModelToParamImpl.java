package com.demo.cashierapp.helper.map.mapperToParam;

import com.demo.cashierapp.model.CreateEmployeeRequestModel;
import com.demo.cashierapp.model.CreateEmployeeParams;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class MapperModelToParamImpl implements MapperModelToParam{


    @Override
    public CreateEmployeeParams modelToParam(CreateEmployeeRequestModel createEmployeeRequestModel){
        final CreateEmployeeParams createEmployeeParams = new CreateEmployeeParams();

        createEmployeeParams.setFirstName(createEmployeeRequestModel.getFirstName());
        createEmployeeParams.setLastName(createEmployeeRequestModel.getLastName());
        createEmployeeParams.setPassword(createEmployeeRequestModel.getPassword());
        createEmployeeParams.setUsername(createEmployeeRequestModel.getUsername());

        return createEmployeeParams;
    }
}
