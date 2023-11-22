package com.example.firstproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.firstproject.dao.Restaurant;
import com.example.firstproject.dao.RestaurantDao;


@Component
public class ReastaurantService {
	
    @Autowired 
    private RestaurantDao  restaurantDao;
    
    public  List<Restaurant> getRestaurant(){
    	
        List<Restaurant> restaurants = new ArrayList<>();
        
        this.restaurantDao.findAll().forEach(restaurants::add);
        return restaurants;
    }

}
