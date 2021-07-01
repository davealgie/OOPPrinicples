package com.qa.garage;

public class Runner {
	  public static void main(String[] args) {
		 
		  Garage garage = new Garage();
		  
		  garage.add(new Van(200, 3.0f, 2));
		  garage.add(new Van(250, 2.5f, 2));
		  garage.add(new Car(200, 1.5f, 4));
		  garage.add(new Motorbike(130, 0.8f, 2));
		  
		  garage.bills();
		  System.out.println("Van 1: " + garage.fix(0) + "\nMotorbike 1: " + garage.fix(3));
	  }
}
