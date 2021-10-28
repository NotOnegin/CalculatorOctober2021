package com.calculator;

import java.util.Scanner;

public class Calculator {

	String a;
	char c;
	String b;
	String romanResult;

public static void main(String[] args) {

	Scanner ScanInput = new Scanner(System.in);
	System.out.println("Enter your arithmetic expression:");
	String a = ScanInput.next().toUpperCase();
	char c = ScanInput.next().charAt(0);
	String b = ScanInput.next().toUpperCase();	
	
	
if ((a.equals("I")) || (a.equals("II")) || (a.equals("III")) || (a.equals("IV")) || (a.equals("V")) || (a.equals("VI")) 
|| (a.equals("VII")) || (a.equals("VIII")) || (a.equals("IX")) || (a.equals("X"))) { 
		
		Roman.Convert(a, c, b);
}
else {
		Operators.Calculate(a, c, b);
}
}
}







	



	

