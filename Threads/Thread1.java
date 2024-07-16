package com.sriindu.threads;

public class Thread1 {
	
	public static void main(String[] args) {
		System.out.println("Hello students , welcome to TNS sessions");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
	}
}
