package com.in28minutes.oops;

public class BookRunner {

	// Create new class called Book
	
	public static void main(String[] args) {
		
		
		//Create three instances
		// name of the variable as camelcase

		Book artOfComputerPrograming = new Book();
		
		
		Book effectiveJava = new Book();
		
		Book cleanCode = new Book();
		
		artOfComputerPrograming.stock();
		
		effectiveJava.stock();
		
		cleanCode.stock();
		
		
		
		artOfComputerPrograming.noOfCopies =10;
		effectiveJava.noOfCopies = 20;
		cleanCode.noOfCopies = 50;
		
		
		
	}

}
