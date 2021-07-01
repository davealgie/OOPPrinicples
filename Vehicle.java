package com.qa.garage;

public class Vehicle extends Garage{
	  private int wheels;
	  private int maxSpeed;
	  private String type;
	  
	  public Vehicle(int wheels, int maxSpeed, String type) {
		    this.wheels = wheels;
		    this.maxSpeed = maxSpeed;
		    this.type = type;
		  }
	
	  public float bill() {
		    return (float) this.wheels * this.maxSpeed;
		  }
	  
	  public void crash() {
		    System.out.println("The " + type + " has crashed.");
		  }
	  
	  public void brake() {
		    System.out.println("The " + type + " is braking.");
		  }
	  
	  public void accelerate() {
		    System.out.println("The " + type + " goes faster.");
		  }
	  
	  public int getMaxSpeed() {
		    return this.maxSpeed;
		  }
	  public void setMaxSpeed(int maxSpeed) {
		    this.maxSpeed = maxSpeed;
		  }
	  
	  public int getWheels() {
		    return this.wheels;
		  }
	  public void setWheels(int wheels) {
		    this.wheels = wheels;
		  }
	  
	  public String getType() {
		    return this.type;
		  }
	  public void setType(String type) {
		    this.type = type;
		  }
	  
	  
	  
}
