package com.in28minutes.oops;

public class BookRunner1 {

	public static void main(String[] args) {
		
		Book1 artOfComputerPrograming = new Book1();
		Book1 effectiveJava = new Book1();
		Book1 cleanCode = new Book1();
				
		artOfComputerPrograming.SetnoOfCopies(10);
		effectiveJava.SetnoOfCopies(20);
		cleanCode.SetnoOfCopies(30);
		
//		artOfComputerPrograming.noOfCopies = 10;
//		effectiveJava.noOfCopies = 30;
//		cleanCode.noOfCopies = 39;
	}

}