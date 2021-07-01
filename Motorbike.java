package com.qa.garage;

public class Motorbike extends Vehicle {
	  private float fuelCapacity;
	  private float currentFuel;
	  private int seats;
	  
	  public Motorbike(int maxSpeed, float fuelCapacity, int seats) {
		    super(2, maxSpeed, "Motorbike");
		    this.fuelCapacity = fuelCapacity;
		    this.seats = seats;
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
		    return (this.getWheels() * this.getMaxSpeed()) + this.seats + this.refuel(90);
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

	  public int getSeats() {
		  return seats;
	  }
	  public void setSeats(int seats) {
		  this.seats = seats;
	  }
	  
	  
}
