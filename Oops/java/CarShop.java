package com.Oops.java;

/**
 * Create a program for a Car shop to calculate the no of cars sold.
Car class has three attributes: speed (int), car owner (String), car type
(String).Write methods to get and set above values of the car object.
Also devise a way to calculate the number of cars sold by the car
shop
 * @author velda
 *
 */

public class CarShop {
	
	int speed;
	String car_owner;
    String car_type;
    
   
	
	public CarShop(String car_owner, String car_type, int speed) {
		// TODO Auto-generated constructor stub
		
		System.out.println(car_owner+" "+car_type+" "+speed);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCar_owner() {
		return car_owner;
	}
	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	
    
    
    
}
