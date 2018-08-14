package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
