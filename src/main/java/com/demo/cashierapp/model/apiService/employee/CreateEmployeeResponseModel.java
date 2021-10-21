package com.demo.cashierapp.model.apiService.employee;

import com.demo.cashierapp.entity.Role;
import com.demo.cashierapp.model.BaseEmployee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateEmployeeResponseModel extends BaseEmployee {
    private List<Role> roleList;
}