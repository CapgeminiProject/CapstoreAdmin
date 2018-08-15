package com.capgemini.adminstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.adminstore.repo.AddressRepo;
import com.capgemini.adminstore.repo.AdminRepo;
import com.capgemini.adminstore.repo.CartRepo;
import com.capgemini.adminstore.repo.CategoryRepo;
import com.capgemini.adminstore.repo.CouponRepo;
import com.capgemini.adminstore.repo.CustomerRepo;
import com.capgemini.adminstore.repo.DiscountRepo;
import com.capgemini.adminstore.repo.InventoryRepo;
import com.capgemini.adminstore.repo.MerchantRepo;
import com.capgemini.adminstore.repo.OrdersRepo;
import com.capgemini.adminstore.repo.ProductRepo;
import com.capgemini.adminstore.repo.ReviewRepo;
import com.capgemini.adminstore.repo.WishlistRepo;

@Component(value="adminServices")
public class AdminServicesImpl implements AdminServices {

	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private CouponRepo couponRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private DiscountRepo discountRepo;
	
	@Autowired
	private InventoryRepo inventoryRepo;
	
	@Autowired
	private MerchantRepo merchantRepo;
	
	@Autowired
	private OrdersRepo ordersRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ReviewRepo reviewRepo;
	
	@Autowired
	private WishlistRepo wishlistRepo;
}
