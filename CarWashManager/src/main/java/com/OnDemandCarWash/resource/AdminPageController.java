package com.OnDemandCarWash.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminPageController {
	
	@RequestMapping("/")
	public String home() {
		return ("WELCOME ADMIN"
				+"<h2><a href=\"http://localhost:8081/findAllCars/\">List of Cars</a><h2>"
				+"<h2><a href=\"http://localhost:8081/findAllWasher/\">Washers</a><h2>"
				+"<h2><a href=\"http://localhost:8081/findAllServices/\">Services</a><h2>"
				+"<h2><a href=\"http://localhost:8081/findAllAddOns/\">AddOns</a><h2>"
				+"<h2><a href=\"http://localhost:8081/findAllCustomer/\">Customers</a><h2>"
				+"<h2><a href=\"http://localhost:8081/findAllpromo\">Promos</a><h2>"
				+"<h2><a href=\"http://localhost:8081/contactUs\">View Contact Details</a><h2>"
				+ "------------------------"
				+"<h4><a href=\"http://localhost:8081/login?logout\">Logout</a><h4>");
	}
}
