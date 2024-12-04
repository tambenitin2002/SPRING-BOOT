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

import edu.jsp.center.entity.CarWash;
import edu.jsp.center.repository.CarWashRepository;

@RestController
@RequestMapping("/api/v1/car-wash")
public class CarWashController {

    @Autowired
    private CarWashRepository carWashRepository;
    
    @PostMapping("/carwash")
    public CarWash addCarWash(@RequestBody CarWash carWash) {
        return carWashRepository.save(carWash); 
    }
    
    @GetMapping
    public List<CarWash> getAllCarWashes(){
    	return carWashRepository.findAll();
    }
    
    @DeleteMapping("/{id}")
    public void deleteCarWash(@PathVariable int id) {
    	carWashRepository.deleteById(id);
    }
}

