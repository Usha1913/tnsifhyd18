package com.sriindu.threads;

public class Thread2 {
	
	public static void main(String[] args) {
	
		Thread t1 = new Thread();
		t1.start();
		
		Thread t2 = new Thread();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
		
		Thread t4 = new Thread();
		t4.start();
		
	
		System.out.println(Thread.activeCount());
		
	}

}
