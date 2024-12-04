package edu.jsp.center.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.center.entity.CycleWash;
import edu.jsp.center.repository.CycleWashRepository;

@Service
public class CycleWashService {

    @Autowired
    private CycleWashRepository cycleWashRepository;

    public List<CycleWash> getAllCycleWash() {
        return cycleWashRepository.findAll();
    }

    public CycleWash addCycleWash(CycleWash cycleWash) {
        return cycleWashRepository.save(cycleWash);
    }

    public void deleteCycleWashById(int id) {
        cycleWashRepository.deleteById(id);
    }
}
