package com.day1;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) 
	{ 
	Scanner scanner = new Scanner(System.in);

	 // Prompt the user to enter a number 

	System.out.print("Enter a number: ");
	 int number = scanner.nextInt();

	 // Calculate the number of digits

	 int count = 0; int temp = number; 
	while (temp != 0)
	 { 
	temp /= 10; count++;
	 }

	 // Print the number of digits 

	System.out.println("Number of digits in " + number + " is: " + count);

	 // Close the scanner 

	scanner.close(); 
	     } 
	  }

	