package com.demo.com.demo;

public class Calculator {
	
	//Methods for addition,subtraction,multiplication,division
	
	
	   public static int add(int number1, int number2) {
	      return number1 + number2;
	   }
	 
	   public static int subtract(int number1, int number2) {
	      return number1 - number2;
	   }
	 
	   public static int multiply(int number1, int number2) {
	      return number1 * number2;
	   }
	 
	  
	   
	 
	   // Real number divide. Return a double.
	   public static double divide(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      else{
	      return (double) number1 / number2;
	   }
	}}

