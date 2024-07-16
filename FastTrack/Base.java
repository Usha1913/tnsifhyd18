package com.day2;

public class Base {
	public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }

}



