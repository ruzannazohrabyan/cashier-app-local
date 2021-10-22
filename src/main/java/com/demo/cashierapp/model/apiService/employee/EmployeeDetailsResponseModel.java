package com.demo.cashierapp.model.apiService.employee;

import com.demo.cashierapp.entity.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDetailsResponseModel extends BaseEmployee {
    @JsonProperty("roles")
     List<Role> roleList;

}
