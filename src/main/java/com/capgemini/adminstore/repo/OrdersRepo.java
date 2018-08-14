package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
