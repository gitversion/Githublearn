package com.in28minutes.oops;

public class MotarBikeRunner1 {

	public static void main(String[] args) {

		// Create instance variable

		MotarBike1 ducati = new MotarBike1();
		MotarBike1 honda = new MotarBike1();

		// start the bikes ducati and honda
				
		ducati.start();
		honda.start();
		
		// Setting current speed and assgining the values
		
	//	The MotarBikeRunner1 class is directly accessing the value of instance variable
	//	of  the MotarBike class.args This is not consider to be the good practice.
	//	MortarBikeRunner1 is different class of its own. This class is directly accessing the
	//	internal variables (Example Speed) of this class. This breaks ENCAPUSLATION.
	// The principle is that other classes should not change the data of specific class directly.
		
		ducati.speed = 10;
		honda.speed = 50;
		
		// Changing the speed level
		
		ducati.speed = 40;
		honda.speed = 20;
		
	}

}
