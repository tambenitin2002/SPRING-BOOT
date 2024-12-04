package edu.jsp.center.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.center.entity.BikeWash;
import edu.jsp.center.repository.BikeWashRepository;



@RestController
@RequestMapping("/api/v1/bike-wash")
public class BikeWashController {
   
	@Autowired
	private BikeWashRepository bikeWashRepository;
	
	@PostMapping
	public BikeWash addBikeWash(@RequestBody BikeWash bikeWash) {
		return bikeWashRepository.save(bikeWash);
				
	}
	
	@GetMapping
    public List<BikeWash> getAllBikeWashe(){
    	return bikeWashRepository.findAll();
    }
    
    @DeleteMapping("/{id}")
    public void deleteBikeWash(@PathVariable int id) {
    	bikeWashRepository.deleteById(id);
    }
	
}
