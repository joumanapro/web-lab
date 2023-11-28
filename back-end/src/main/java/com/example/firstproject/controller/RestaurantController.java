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
    //deletefunction 
    @deleteMapping("/delete/restaurant/{id}"){
    public void deleteRestaurant(@pathVariable long restaurant_id){
        ReastaurantService.deleteRestaurant(restaurant_id);
    }
    }
    
    @putMapping("/restaurant/{id}")
    public Restaurant updateRestaurant(@pathVariable long id,@RequestBody Restaurant restaurant){
           Restaurant.setRestaurant_id(id);
           restaurantService.updateRestaurant(restaurant);
    }



    @GetMapping("/")
	public String message() {
		return"---------Hello Spring Boot App------------";
	}
}
