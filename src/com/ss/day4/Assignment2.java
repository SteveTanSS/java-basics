package com.ss.day4;

public class Assignment2 {

	//create two objects that can lock between each other
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	

	//Thread 1 which uses lock1 then waits for lock2 to be freed before letting go of lock 1
	private static class Thread1 extends Thread{
		public void run() {
			synchronized(lock1) {
				System.out.println("Thread1- Has the first lock");
				
			}
			
			try {
				Thread.sleep(1000);
				
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread1- waiting for lock2");
			
			synchronized (lock2) {
				System.out.println("Thread1- No deadlock");
			}
		}
	}
	
	//Thread 2 locks lock2 and waits for lock1 to be freed before releasing lock2
	private static class Thread2 extends Thread{
		public void run() {
			synchronized(lock2) {
				System.out.println("Thread2- Has the second lock");
				
			}
			try {
				Thread.sleep(1000);

			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread2- waiting for lock1");
			
			synchronized (lock1) {
				System.out.println("Thread2- No deadlock");
			}
		}
	}
	
	//In the test case both threads have their own locks and are waiting for the other to free the lock therefore causing a deadlock
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();

	}


}
