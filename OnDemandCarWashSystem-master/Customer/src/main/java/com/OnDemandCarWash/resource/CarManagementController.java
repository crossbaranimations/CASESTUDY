package com.OnDemandCarWash.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.CarManagement;
import com.OnDemandCarWash.repository.CarManagementRepository;

//For Managing the cars

@RestController
public class CarManagementController {
	
	@Autowired
	private CarManagementRepository repository;
	
	//For displaying all cars
	@GetMapping("/findAllCars")
	public List<CarManagement> getBooks(){
		return repository.findAll();
	}
}
