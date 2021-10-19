package com.demo.cashierapp.helper.map.mapperToResponseModel;

import com.demo.cashierapp.entity.Employee;
import com.demo.cashierapp.entity.EmployeeRole;
import com.demo.cashierapp.model.EmployeeDetailsResponseModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
@Setter
public class MapperModelToResponseModelImpl implements MapperModelToResponseModel {



    @Override
    public EmployeeDetailsResponseModel modelToResponse(Employee employee) {
        final EmployeeDetailsResponseModel employeeDetailsResponseModel = new EmployeeDetailsResponseModel();

        employeeDetailsResponseModel.setFirstName(employee.getFirstName());
        employeeDetailsResponseModel.setLastName(employee.getLastName());
        employeeDetailsResponseModel.setUsername(employee.getUsername());
        employeeDetailsResponseModel.setRoles(employee.getRoles().stream().map(EmployeeRole::getRole).collect(Collectors.toList()));

        return employeeDetailsResponseModel;

    }
}
