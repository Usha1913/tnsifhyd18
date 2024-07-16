package com.sriindu.threads;

public class ThreadCreateExtends {
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.start();	
		
		 Manager m1 = new Manager(); 
		 m1.start();
				
		System.out.println(Thread.activeCount());
		
	}

}
class Employee extends Thread{
	
	@Override
	public void run() {
		System.out.println("Hello");
	}
	
}



 class Manager extends Thread{
 
  @Override 
  public void run() 
  { 
	  System.out.println("Hi"); 
	  
  }
 
  }
 


