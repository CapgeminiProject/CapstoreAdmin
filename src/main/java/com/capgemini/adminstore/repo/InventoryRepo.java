package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

}
