package com.OnDemandCarWash.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.CarWashService;
import com.OnDemandCarWash.repository.CarWashServiceRepository;

//For managing the services

@RestController
public class CarWashServiceController {
	
	@Autowired
	private CarWashServiceRepository repository;
	
	//For fetching all the services
	@GetMapping("/findAllServices")
	public List<CarWashService> getBooks(){
		return repository.findAll();
	}
}
