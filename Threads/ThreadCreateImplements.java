package com.sriindu.threads;

import com.sriindu.implementingrunnable.MultithreadingDemo;

public class ThreadCreateImplements {
	
	public static void main(String[] args) {
		
		
		Employee1 e1 = new Employee1();
		Thread t1 = new Thread(e1);
		t1.start();
		
		
		  Manager1 m1 = new Manager1(); 
		  Thread t2 = new Thread(m1);
		  t2.start();
		 
			
		System.out.println(Thread.activeCount());
		
	}

}

class Employee1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
		
	}
}


class Manager1 implements Runnable{
 
  @Override public void run() 
  { 
	  System.out.println("Hi");
  
  }
  
  }
 

