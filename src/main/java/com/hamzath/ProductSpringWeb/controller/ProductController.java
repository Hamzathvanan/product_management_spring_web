package com.hamzath.ProductSpringWeb.controller;

import com.hamzath.ProductSpringWeb.domain.Product;
import com.hamzath.ProductSpringWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
    return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public List<Product> getProduct(@PathVariable String name){
        return service.getProduct(name);
    }

}
