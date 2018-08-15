package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
