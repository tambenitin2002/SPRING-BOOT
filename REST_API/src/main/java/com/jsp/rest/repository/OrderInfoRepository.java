package com.jsp.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.rest.entity.OrderInfo;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Integer>{

}
