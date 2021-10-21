package com.demo.cashierapp.api.service.employee;

import com.demo.cashierapp.model.apiService.employee.*;
import java.util.List;

public interface EmployeeApiService {
    CreateEmployeeResponseModel create(CreateEmployeeRequestModel createEmployeeRequestModel);

    List<EmployeeDetailsModel> getAll();

    EmployeeDetailsModel getByUsername(String username);

    void deleteByUsername(String username);

    EditEmployeeResponseModel edit(EditEmployeeRequestModel editEmployeeRequestModel);
}
