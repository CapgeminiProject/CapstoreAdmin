package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String>{

}
