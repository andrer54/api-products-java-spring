package com.products.apiprodutos.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.apiprodutos.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
    
}
