package com.in28minutes.oops;

public class MotarBike2 {
	
	// if I keep private in-front of member variable it wont allow the other 
	//class from MotarBikeRunner2.java only MotarBike2 class access the speed
	
	//state
	private int speed;
	
	//The way we can fix this by adding method which would expose data out.
	//Now create a method for setting the value of speed
	//we create a method. 
	// First we think about what should be 
	// input - int speed
	// output 
	// name
	
	void setSpeed(int speed ) { //Here speed is local variable of specific method
		this.speed = speed ; // specify the speed and we are accessing member variable 
		//private int speed and setting the value from this.speed =speed into parameter
		//or argument comes set it to the state
		
		System.out.println(speed);
		//System.out.println(this.speed);
		
		
		
	}
	
	//behaviour
	void start() {
		
		System.out.println("Speed");
	}

}
