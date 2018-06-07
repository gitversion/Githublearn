package com.in28minutes.oops;

public class Book1 {

	//State
	 private int  noOfCopies;
	
	
	 // behaviour
	public void SetnoOfCopies( int noOfCopies) {
		
		this.noOfCopies = noOfCopies;
		
		System.out.println("The no Of Copies of books are :" + noOfCopies);
		 
	}
}
