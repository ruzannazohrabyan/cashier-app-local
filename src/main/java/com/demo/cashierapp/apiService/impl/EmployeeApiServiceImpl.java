//package com.demo.cashierapp.apiService.impl;
//
//import com.demo.cashierapp.entity.Employee;
//import com.demo.cashierapp.apiService.EmployeeApiService;
//import com.demo.cashierapp.entity.Role;
//import com.demo.cashierapp.helper.map.mapperToParam.MapperModelToParamImpl;
//import com.demo.cashierapp.helper.map.mapperToResponseModel.MapperModelToResponseModelImpl;
//import com.demo.cashierapp.model.CreateEmployeeParamsResponse;
//import com.demo.cashierapp.model.CreateEmployeeRequestModel;
//import com.demo.cashierapp.model.EmployeeDetailsResponseModel;
//import com.demo.cashierapp.service.employee.EmployeeService;
//import com.demo.cashierapp.service.role.EmployeeRoleService;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class EmployeeApiServiceImpl implements EmployeeApiService {
//    private final EmployeeService employeeService;
//    private final EmployeeRoleService employeeRoleService;
//
//    public EmployeeApiServiceImpl(EmployeeService employeeService, EmployeeRoleService employeeRoleService) {
//        this.employeeService = employeeService;
//        this.employeeRoleService = employeeRoleService;
//    }
//
//    @Override
//    public EmployeeDetailsResponseModel create(CreateEmployeeRequestModel employeeCreateModel) {
//
//        final CreateEmployeeParamsResponse savedEmployee = employeeService.save(new MapperModelToParamImpl().modelToParam(employeeCreateModel));
//        for (Role role : employeeCreateModel.getRoles()) {
//            employeeRoleService.save(savedEmployee, role);
//        }
//        return new MapperModelToResponseModelImpl().modelToResponse(employeeService.getEmployeeByUsername(savedEmployee.getUsername()));
//    }
//
//    @Override
//    public List<EmployeeDetailsResponseModel> getAll() {
//        employeeService.getAll();
//        return null;
//    }
//}
