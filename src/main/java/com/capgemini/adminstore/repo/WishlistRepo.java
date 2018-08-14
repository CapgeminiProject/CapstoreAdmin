package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.adminstore.beans.Wishlist;

public interface WishlistRepo extends JpaRepository<Wishlist, Integer> {

}
