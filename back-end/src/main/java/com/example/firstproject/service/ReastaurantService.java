package com.example.firstproject.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.firstproject.dao.Restaurant;
import com.example.firstproject.dao.RestaurantRepository;




@Service
public class ReastaurantService {
	
    private final RestaurantRepository  restaurantRepository;
     
     public ReastaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }
    ////read////
    public List<Restaurant> getRestaurant(){
    	
        List<Restaurant> restaurants = new ArrayList<>();
        
        this.restaurantRepository.findAll().forEach(restaurants::add);
        return restaurants;
    }
    ////create /////
    public void addRestaurant(Restaurant restaurant){
      Optional<Restaurant> restaurantOptional= 
       restaurantRepository.findrestaurantById(restaurant.getRestaurant_id());
       if (restaurantOptional.isPresent()){
         throw new IllegalStateException("ooops");
       }
        restaurantRepository.save(restaurant);  
    }

    ////delete////
    public void deleteRestaurant(long restaurant_id){
        boolean exists= restaurantRepository.existsById(restaurant_id);
        if(!exists){
            throw new IllegalStateException("resturant with id" +restaurant_id+ "does not exists");
        }
        restaurantRepository.deleteById(restaurant_id);
    }
    
    /////update///
    public Restaurant updateRestaurant(Restaurant restaurant){
        return  restaurantRepository.save(restaurant);
        
    }

}

