package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Discount;

public interface DiscountRepo extends JpaRepository<Discount, Integer>{

}
