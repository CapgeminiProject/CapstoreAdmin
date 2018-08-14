package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Integer>{

}
