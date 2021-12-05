package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.PromoCode;
import com.OnDemandCarWash.repository.PromoCodeRepository;

@RestController
public class PromoCodeController {
	
	@Autowired
	private PromoCodeRepository repository;
	
	//For Adding the Promo codes
	@PostMapping("/addPromo")
	public int saveBook(@RequestBody PromoCode promo) {
		repository.save(promo);
		return promo.getId();
	}
	
	//For Deleting the Promo Codes
	@DeleteMapping("/deletePromo")
	public String deletePromoCode(@PathVariable int id) {
		repository.deleteById(id);
		return "PromoCode deleted with id: "+id;
	}
	//For Fetching all the Promo Codes
	@GetMapping("/findAllpromo")
	public List<PromoCode> getBooks(){
		return repository.findAll();
	}
}
