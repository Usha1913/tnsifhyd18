package com.day1;

import java.util.Scanner;

public class MultiplicationTable {
	 public static void main(String[] args) 
	 { 
	 Scanner scanner = new Scanner(System.in); 

	 // Prompt the user to enter a number 

	 System.out.print("Enter a number: ");
	  int number = scanner.nextInt();
	  
	 // Prompt the user to enter the range 

	 System.out.print("Enter the range: "); 
	 int range = scanner.nextInt();

	  // Print the multiplication table
	  
	 System.out.println("Multiplication Table for " + number + ":"); 
	 for (int i = 1; i <= range; i++)
	  { 
	 System.out.println(number + " * " + i + " = " + (number * i)); 
	 } 

	 // Close the scanner 

	 scanner.close();
	    }
	  }




