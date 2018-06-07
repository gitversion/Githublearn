package com.in28minutes.oops;

public class MotarBikeRunner2 {

	public static void main(String[] args) {

		MotarBike2 ducati =  new MotarBike2();
		MotarBike2 honda = new MotarBike2();
		
 /*		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			The field MotarBike2.speed is not visible
			The field MotarBike2.speed is not visible */
		
		ducati.setSpeed(100);
		honda.setSpeed(20);
		
		ducati.setSpeed(200);
		honda.setSpeed(45);
			
//		ducati.speed = 20;
//		honda.speed = 10;
		
		ducati.start();
		honda.start();
		
	}

}
