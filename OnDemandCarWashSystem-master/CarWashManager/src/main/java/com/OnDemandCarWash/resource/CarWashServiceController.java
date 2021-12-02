package com.OnDemandCarWash.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.CarWashService;
import com.OnDemandCarWash.repository.CarWashServiceRepository;

//For managing the services
@RestController
public class CarWashServiceController {
	
	@Autowired
	private CarWashServiceRepository repository;
	
	//For Adding the services
	@PostMapping("/addservice")
	public int saveBook(@RequestBody CarWashService carws) {
		repository.save(carws);
		return carws.getId();
	}
	//For finding the single service
	@GetMapping("/findSingleService/{id}")
	public Optional<CarWashService> getCarWashService(@PathVariable int id){
		return repository.findById(id);
	}
	//For removing the service
	@DeleteMapping("/deleteservice/{id}")
	public String deleteCarWashService(@PathVariable int id) {
		repository.deleteById(id);
		return "service deleted with id: "+id;
	}
	
	//For fetching all the services
	@GetMapping("/findAllServices")
	public List<CarWashService> getBooks(){
		return repository.findAll();
	}
}
