package com.hamzath.ProductSpringWeb.controller;

import com.hamzath.ProductSpringWeb.domain.Product;
import com.hamzath.ProductSpringWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
    return service.getAllProducts();
    }

    @GetMapping("/product/samsung")
    public List<Product> getProduct(){
        return service.getProduct("Samsung TV");
    }

}
