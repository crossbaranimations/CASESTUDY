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

import com.OnDemandCarWash.model.Washer;
import com.OnDemandCarWash.repository.WasherRepository;

//For managing the washers
@RestController
public class WasherController {
	
	//For Adding Washer
	@Autowired
	private WasherRepository repository;
	@PostMapping("/addWasher")
	public int saveBook(@RequestBody Washer washer) {
		repository.save(washer);
		return washer.getId();
	}
	
	//For Finding the washer
	@GetMapping("/findSingleWasher/{id}")
	public Optional<Washer> getWasher(@PathVariable int id){
		return repository.findById(id);
	}
	
	//For removing the washer
	@DeleteMapping("/deleteWasher/{id}")
	public String deleteEmployee(@PathVariable int id) {
		repository.deleteById(id);
		return "washer deleted with id: " +id;
	}
	
	//For displaying all Washers
	@GetMapping("/findAllWasher")
	public List<Washer> getBooks()
	{
		return repository.findAll();
	}
}
