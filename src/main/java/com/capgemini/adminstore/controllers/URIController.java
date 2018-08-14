package com.capgemini.adminstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.adminstore.beans.Admin;

@Controller
public class URIController {

	@ModelAttribute("admin")
	public Admin getAdmin() {
		return new Admin();
	}
	
	@RequestMapping(value="/")
	public String getWelcomePage(){
		return "";
	}
}
