package com.OnDemandCarWash.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.Customer;
import com.OnDemandCarWash.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/")
	public String home() {
		return ("<h1>GREEN CAR WASH</h1><h2><a href=\"http://localhost:8081/findAllCars/\">List of Cars </a><h2><h2><a href=\"http://localhost:8081/findAllServices/\">Services </a><h2><h2><a href=\"http://localhost:8081/findAllAddOns/\">Add Ons </a><h2><h2><a href=\"http://localhost:8081/findAllpromo/\">Promo Codes</a><h2><h2><a href=\"http://localhost:8081/contactUs/\">Contact Us</a><h2>"
				+ "<h3>Click here to book</h3>");
	}

	@PostMapping("/add")
	public int saveBook(@RequestBody Customer customer) {
		repository.save(customer);
		return customer.getId();
	}
}
