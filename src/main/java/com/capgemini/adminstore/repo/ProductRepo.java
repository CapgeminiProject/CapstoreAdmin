package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
