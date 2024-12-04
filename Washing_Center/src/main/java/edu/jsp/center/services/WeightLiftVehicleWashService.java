package edu.jsp.center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.center.entity.WeightLiftVehiclesWash;
import edu.jsp.center.repository.WeightLiftVehiclesWashRepository;

@Service
public class WeightLiftVehicleWashService {
	
	   @Autowired
	    private  WeightLiftVehiclesWashRepository weightLiftVehiclesWashRepository ;

	    public List<WeightLiftVehiclesWash> getAllWeightLiftVehicleWash() {
	        return weightLiftVehiclesWashRepository .findAll();
	    }

	    public WeightLiftVehiclesWash addWeightLiftVehicleWash(WeightLiftVehiclesWash weightLiftVehicleWash) {
	        return weightLiftVehiclesWashRepository .save(weightLiftVehicleWash);
	    }

	    public void deleteWeightLiftVehicleWashById(int id) {
	    	weightLiftVehiclesWashRepository .deleteById(id);
	    }

}
