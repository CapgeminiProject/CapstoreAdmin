package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
