package com.example.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleWebApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {   //here Product is the entity or class and Integer is the primary key



}
