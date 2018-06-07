package com.in28minutes.oops;

public class MotarBikeRunner6 {

	public static void main(String[] args) {
	
	MotarBike6 ducati = new MotarBike6();
	MotarBike6 honda = new MotarBike6();
	
	ducati.SetSpeed(100);
	
	honda.SetSpeed(80);
	
	System.out.println(honda.GetSpeed());
	}

}
