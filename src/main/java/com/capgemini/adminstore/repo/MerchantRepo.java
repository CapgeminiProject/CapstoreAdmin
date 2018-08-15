package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Merchant;

public interface MerchantRepo extends JpaRepository<Merchant, Integer>{

}
