package com.demo.cashierapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeRole {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_role_seq_gen")
    @SequenceGenerator(name = "employee_role_seq_gen", sequenceName = "employee_role_id_seq")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "username")
    private Employee employee;
}
