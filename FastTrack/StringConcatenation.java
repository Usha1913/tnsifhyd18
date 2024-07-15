package com.day1;

import java.util.Scanner;

public class StringConcatenation {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		 // Prompt the user to enter the first string 

		System.out.print("Enter the first string: "); 
		String str1 = scanner.nextLine(); 

		// Prompt the user to enter the second string 

		System.out.print("Enter the second string: "); 
		String str2 = scanner.nextLine(); 

		// Concatenate the two strings

		 String concatenatedString = str1 + str2; 

		// Print the result

		 System.out.println("The concatenated string is: " + concatenatedString); 

		// Close the scanner 
		scanner.close();

		   }
		 }
		    
	

