package com.sh.springbootmicroservice1product.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="name", length = 100, nullable = false)
    private  String name;

    @Column(name="price",  nullable = false)
    private Double price;

    @Column(name="createTime",  nullable = false)
    private LocalDateTime createTime;
}
