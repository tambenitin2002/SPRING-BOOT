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


import edu.jsp.center.entity.WeightLiftVehiclesWash;
import edu.jsp.center.repository.WeightLiftVehiclesWashRepository;

@RestController
@RequestMapping("/api/v1/weight-lift-vehicles/")
public class WeightLiftVehiclesWashController {
	
	@Autowired
	private WeightLiftVehiclesWashRepository weightLiftVehiclesWashRepository;
	
	@PostMapping
	public WeightLiftVehiclesWash addWeightLiftVehicles(@RequestBody WeightLiftVehiclesWash weightLiftVehicles) {
		return weightLiftVehiclesWashRepository.save(weightLiftVehicles);
	}
	
	@GetMapping
    public List<WeightLiftVehiclesWash> getAllWeightLiftVehiclesRepositoryWashes(){
    	return weightLiftVehiclesWashRepository.findAll();
    }
    
    @DeleteMapping("/{id}")
    public void deleteWeightLiftVehiclesWashById(@PathVariable int id) {
    	weightLiftVehiclesWashRepository.deleteById(id);
    }

}
