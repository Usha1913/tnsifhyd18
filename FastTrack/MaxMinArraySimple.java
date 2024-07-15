package com.day1;

import java.util.Scanner;

public class MaxMinArraySimple {
	public static void main(String[] args)
	 {
	 Scanner scanner = new Scanner(System.in); 

	System.out.print("Enter the number of elements in the array: "); 
	int n = scanner.nextInt(); 

	// Declare an array of integers

	 int[] array = new int[n]; 

	// Prompt the user to enter the elements of the array

	 System.out.println("Enter the elements of the array:"); 
	for (int i = 0; i < n; i++)
	 { 
	array[i] = scanner.nextInt();
	 }
	 // Initialize variables to store max and min values 

	int max = array[0]; int min = array[0]; 

	// Iterate through the array to find max and min 

	for (int i = 1; i < n; i++) 
	{
	 if (array[i] > max)
	 {
	 max = array[i];
	 }
	 if (array[i] < min)
	 { 
	min = array[i]; 
	} } 

	// Print the maximum and minimum elements 

	System.out.println("Maximum element in the array: " + max); 
	System.out.println("Minimum element in the array: " + min);

	 // Close the scanner 
	scanner.close(); 
	  } 


}
