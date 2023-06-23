package com.hamzath.ProductSpringWeb.service;

import com.hamzath.ProductSpringWeb.domain.Product;
import com.hamzath.ProductSpringWeb.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository db;

    public void show(){
        System.out.println("In Show");
    }

//    public void addProduct(Product p){
//
////        products.add(p);
//        db.save(p);
//    }
//
    public List<Product> getAllProducts(){
        return db.findAll();
    }
    public List<Product> getProduct(String name){
        return db.findByName(name);
    }

}
