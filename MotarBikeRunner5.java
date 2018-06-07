package com.in28minutes.oops;

public class MotarBikeRunner5 {

	public static void main(String[] args) {

		MotarBike5 ducati =  new MotarBike5();
		MotarBike5 honda = new MotarBike5();
		
		ducati.getSpeed(20);
		System.out.println(ducati.getSpeed(20));
		
		honda.getSpeed(10);
		System.out.println(ducati.getSpeed(10));		

	}

}
