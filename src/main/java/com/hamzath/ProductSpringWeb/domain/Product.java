package com.hamzath.ProductSpringWeb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String place;
    private int warranty;

    public Product(){

    }

    public Product(String name, String type, String place, int warranty){
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }
}
