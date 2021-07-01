package com.qa.garage;

public class Car extends Vehicle{
	  private float fuelCapacity;
	  private float currentFuel;
	  private int doors;

	  public Car(int maxSpeed, float fuelCapacity, int doors) {
		  	super(4, maxSpeed, "Car");
		  	this.fuelCapacity = fuelCapacity;
		  	this.doors = doors;
	  }
	  
	  public void honkHorn() {
		    System.out.println("Honk");
		  }
	  
	  public float refuel(int pricePerLitre) {
		    float cost = (this.fuelCapacity - this.currentFuel) * pricePerLitre;
		    this.currentFuel = this.fuelCapacity;
		    return cost;
		  }
	  
	  public float bill() {
		    return (this.getWheels() * this.getMaxSpeed()) + this.doors + this.refuel(140);
		  }
	  
	  public float getFuelCapacity() {
		  return fuelCapacity;
	  }
	  public void setFuelCapacity(float fuelCapacity) {
		  this.fuelCapacity = fuelCapacity;
	  }

	  public float getCurrentFuel() {
		  return currentFuel;
	  }
	  public void setCurrentFuel(float currentFuel) {
		  this.currentFuel = currentFuel;
	  }

	  public int getDoors() {
		  return doors;
	  }
	  public void setDoors(int doors) {
		  this.doors = doors;
	  }
	  
}
