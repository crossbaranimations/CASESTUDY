package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.AddOns;
import com.OnDemandCarWash.repository.AddOnsRepository;

//For Managing AddOnsSerive
@RestController
public class AddOnsController {
	
	@Autowired
	private AddOnsRepository repository;
	
	//For Adding the AddOn Services
	@PostMapping("/addAddons")
	public int saveBook(@RequestBody AddOns addOns) {
		repository.save(addOns);
		return addOns.getId();
	}
	//For Deleting the AddOn Services
	@DeleteMapping("/deleteAddons/{id}")
	public String deleteAddOns(@PathVariable int id) {
		repository.deleteById(id);
		return "AddOn is deleted with id: "+id;
	}
	//For Finding all the AddOns service
	@GetMapping("/findAllAddOns")
	public List<AddOns> getBooks(){
		return repository.findAll();
	}
}
