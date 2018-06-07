package com.in28minutes.oops;

public class MotarBike4 {

	private int speed;
	
	// setter method
	void setSpeed(int speed){  // local variable
		this.speed = speed;
//		System.out.println(this.speed);
	}
	
	//getter method
	int getSpeed() {
		return this.speed;
	}
	
	void start() {
		System.out.println("The Speed of MotarBike");
	}
}
