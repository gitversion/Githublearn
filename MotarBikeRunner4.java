package com.in28minutes.oops;

public class MotarBikeRunner4 {

	public static void main(String[] args) {
	
		MotarBike4 ducati = new MotarBike4();
		MotarBike4 honda = new MotarBike4();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
		
		ducati.setSpeed(20);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(0);
		System.out.println(honda.getSpeed());
		
	

	}

}
