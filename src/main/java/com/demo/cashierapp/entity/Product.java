package com.demo.cashierapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ_GEN")
    @SequenceGenerator(name = "PRODUCT_SEQ_GEN", sequenceName = "PRODUCT_ID_SEQ", allocationSize = 1)
    private Long id;
}
