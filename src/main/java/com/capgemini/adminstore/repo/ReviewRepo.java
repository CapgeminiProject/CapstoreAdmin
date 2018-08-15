package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

}
