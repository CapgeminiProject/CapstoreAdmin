package com.capgemini.adminstore.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.adminstore.beans.Admin;

@RestController
public class URIController {

	@ModelAttribute("admin")
	public Admin getAdmin() {
		return new Admin();
	}
	
	@RequestMapping(value="/")
	public String getWelcomePage(){
		return "Welcome";
	}
}
