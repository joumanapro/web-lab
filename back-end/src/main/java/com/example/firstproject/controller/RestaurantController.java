package com.example.firstproject.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstproject.dao.Restaurant;
import com.example.firstproject.service.ReastaurantService;


@RestController 
@RequestMapping("/api")
public class RestaurantController {
	
    // @Autowired
    private ReastaurantService restaurantService;
    
    public RestaurantController(ReastaurantService restaurantService){
        this.restaurantService=restaurantService;
    }
    
    @GetMapping("/get/restaurant")
    public List<Restaurant> getrestaurant(){
        return restaurantService.getRestaurant();

    }
    //deletefunction 
    /**
     * @param restaurant_id
     */
    @DeleteMapping("/delete/restaurant/{id}")
    public void deleteRestaurant(@PathVariable long restaurant_id){
        restaurantService.deleteRestaurant(restaurant_id);
    }
    
    
    @PutMapping("/restaurant/{id}")
    public void updateRestaurant(@PathVariable long id,@RequestBody Restaurant restaurant){
           restaurantService.updateRestaurant(restaurant);
    }
    @PostMapping("/restaurent")
    public void addRestaurant( @RequestBody Restaurant restaurant){
           restaurantService.addRestaurant(restaurant);
    }



    @GetMapping("/")
	public String message() {
		return"---------Hello Spring Boot App------------";
	}
}
