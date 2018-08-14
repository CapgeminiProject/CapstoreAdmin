package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
