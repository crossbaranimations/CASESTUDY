package com.CarWashWebApp.HomePage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarWashWebApp.HomePage.model.HomePageModel;
import com.CarWashWebApp.HomePage.repository.HomePageRepo;

@RestController
public class HomePageController {
	
	@Autowired
	private HomePageRepo repository;
	
	@GetMapping("/")
	private String home() {
		return ("<h1>GREEN CAR WASH SERVICES</h1>"
				+ "<h2>Login As</h2>"
				+ "<h3><a href=\"http://localhost:8081/\">Admin</a><h2>"
				+ "<h3>Washer</h3>"
				+ "<h3>Customer</h3>");
	}
	
	@PostMapping("/components")
	public int saveBook(@RequestBody HomePageModel home) {
		repository.save(home);
		return home.getId();
	}
}
