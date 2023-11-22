package com.example.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.dao.Restaurant;
import com.example.firstproject.service.ReastaurantService;


@RestController 
public class RestaurantController {
	
    @Autowired
    private ReastaurantService restaurantService;
    
    
    @GetMapping("/get/restaurant")
    public List<Restaurant> getrestaurant(){
        return restaurantService.getRestaurant();

    }
    
    @GetMapping("/")
	public String message() {
		return"---------Hello Spring Boot App------------";
	}
}
