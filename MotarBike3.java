package com.in28minutes.oops;

public class MotarBike3 {

	// What actually encapsulation is?
	// The encapsulation is protecting the object from directly using by from other objects
	// You don't want other objects directly change your data inside your object
	private int speed;
	
	void setSpeed(int speed) { // local variable
	
		this.speed = speed; //member variable
		
		System.out.println(speed); // Whatever value comes inot this out is the value of local variable
		System.out.println(this.speed); // Whatever value comes into this out is int speed value (i.e member variable)
		
	}
	void start() {
			System.out.println("The bike has started");
	}
}
