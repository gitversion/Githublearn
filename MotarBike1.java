package com.in28minutes.oops;

public class MotarBike1 {
	
	// Encapsulation is that only MotarBike class has to have access to data inside the specfic
	// class
	
		
	// state

	int speed; // Member variable
	
	// All the other classes example MotarBikeRunner1 class should access data through the
	// Behavior of other class the methods of the class offers.
	//If i want to change the state of a class its should be via action/methods/behavior that
	//are performed though that specific class
	
	// Encapsulation is data and methods which access the data and set values to it.
	// All modification to the data of object should be through methods of that specific object.
	// We are modifying data from outside (Ex: MotarBikeRunner1.java) to fixed that see example
	// MotarBikeRunner2.java
	
	// Behavior
	// method
	
	void start() {
		
		System.out.println("The Motarbike Started");
		
	}
	
}
