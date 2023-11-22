package com.example.firstproject.dao;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name = "Restaurant") 
public class Restaurant implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long restaurant_id;
    
    public Long getRestaurant_id() {
        return restaurant_id;
    }
    public void setRestaurant_id(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String manager_name;
    public String getManager_name() {
        return manager_name;
    }
    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
    private String location;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    private String contact_number;
    public String getContact_number() {
        return contact_number;
    }
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
    private String opening_hours;
    public String getOpening_hours() {
        return opening_hours;
    }
    public void setOpening_hours(String opening_hours) {
        this.opening_hours = opening_hours;
    }
    private Date established_date;
    public Date getEstablished_date() {
        return established_date;
    }
    public void setEstablished_date(Date established_date) {
        this.established_date = established_date;
    }
    private String cuisine_type;
    public String getCuisine_type() {
        return cuisine_type;
    }
    public void setCuisine_type(String cuisine_type) {
        this.cuisine_type = cuisine_type;
    }
    private String website_url;
    public Restaurant(Long restaurant_id, String name, String manager_name, String location, String contact_number,
            String opening_hours, Date established_date, String cuisine_type, String website_url, Boolean is_vegetarian,
            Integer rating) {
        this.restaurant_id = restaurant_id;
        this.name = name;
        this.manager_name = manager_name;
        this.location = location;
        this.contact_number = contact_number;
        this.opening_hours = opening_hours;
        this.established_date = established_date;
        this.cuisine_type = cuisine_type;
        this.website_url = website_url;
        this.is_vegetarian = is_vegetarian;
        this.rating = rating;
    }
    public Restaurant() {
    }
    public String getWebsite_url() {
        return website_url;
    }
    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }
    private Boolean is_vegetarian;
    public Boolean getIs_vegetarian() {
        return is_vegetarian;
    }
    public void setIs_vegetarian(Boolean is_vegetarian) {
        this.is_vegetarian = is_vegetarian;
    }
    private Integer rating;
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
