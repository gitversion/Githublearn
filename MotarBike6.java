package com.in28minutes.oops;

public class MotarBike6 {

	private int speed;
	
	public int GetSpeed() {
		return speed;
	}
	
	
	public void SetSpeed(int speed)
	{
		this.speed = speed; // return 100 
		System.out.println(speed); // 100	
		System.out.println(this.speed); // 0
		this.speed = speed; //return 0
	}
	
	
 void  start() {		
		System.out.println("start");
	}
}
