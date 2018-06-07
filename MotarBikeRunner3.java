package com.in28minutes.oops;

public class MotarBikeRunner3 {

	public static void main(String[] args) {
		
		MotarBike3 ducati = new MotarBike3();
		MotarBike3 honda = new MotarBike3();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		honda.setSpeed(80);
		
		ducati.setSpeed(20);
		honda.setSpeed(0);
	}

}
