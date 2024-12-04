package edu.jsp.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.center.entity.CarWash;

public  interface CarWashRepository extends JpaRepository<CarWash, Integer> {

}
