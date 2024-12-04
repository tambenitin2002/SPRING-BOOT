package edu.jsp.center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.center.entity.CarWash;
import edu.jsp.center.repository.CarWashRepository;

@Service
public class CarWashService {
	

	    @Autowired
	    private CarWashRepository carWashRepository;

	    public List<CarWash> getAllCarWash() {
	        return carWashRepository.findAll();
	    }

	    public CarWash addCarWash(CarWash carWash) {
	        return carWashRepository.save(carWash);
	    }

	    public void deleteCarWashById(int id) {
	        carWashRepository.deleteById(id);
	    }
	

}
