package com.demo.cashierapp.model.service.employee;

import com.demo.cashierapp.model.BaseEmployee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateEmployeeRequestSM extends BaseEmployee {
    private String password;
}
