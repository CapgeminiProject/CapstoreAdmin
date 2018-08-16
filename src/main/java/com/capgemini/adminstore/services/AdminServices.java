package com.capgemini.adminstore.services;

import java.util.List;

import com.capgemini.adminstore.beans.Merchant;

public interface AdminServices {

	public List<Merchant> viewAllMerchants();
	
	public Merchant addMerchant(Merchant merchant);
	
	public Merchant removeMerchant(Merchant merchant);
}
