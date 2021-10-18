package com.demo.cashierapp.model;

import com.demo.cashierapp.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmployeeDetailsResponseModel {
    private String username;
    private String firstName;
    private String lastName;
    private List<Role> roles;
}
