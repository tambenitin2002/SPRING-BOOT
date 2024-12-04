package edu.jsp.center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.center.entity.BikeWash;
import edu.jsp.center.repository.BikeWashRepository;

@Service
public class BikeWashService {

    @Autowired
    private BikeWashRepository bikeWashRepository;

    public List<BikeWash> getAllBikeWash() {
        return bikeWashRepository.findAll();
    }

    public BikeWash addBikeWash(BikeWash bikeWash) {
        return bikeWashRepository.save(bikeWash);
    }

    public void deleteBikeWashById(int id) {
        bikeWashRepository.deleteById(id);
    }
}
