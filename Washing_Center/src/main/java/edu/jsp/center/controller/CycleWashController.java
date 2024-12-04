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


import edu.jsp.center.entity.CycleWash;
import edu.jsp.center.repository.CycleWashRepository;


@RestController
@RequestMapping("/api/v1/cycle-wash")
public class CycleWashController {
	
	@Autowired
	private CycleWashRepository cycleWashRepository;
	
	@PostMapping
	public CycleWash addBikeWash(@RequestBody CycleWash cycleWash) {
		return cycleWashRepository.save(cycleWash);
				
	}
	
	@GetMapping
    public List<CycleWash> getAllCycleWashes(){
    	return cycleWashRepository.findAll();
    }
    
    @DeleteMapping("/{id}")
    public void deleteCycleWash(@PathVariable int id) {
       	cycleWashRepository.deleteById(id);
    }

}
