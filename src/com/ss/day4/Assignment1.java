package com.ss.day4;

public class Assignment1 {
	
	//creates a singleton with volatile keyword
	private static volatile Assignment1 singleton = new Assignment1();

	private Assignment1() { }
	
	public static Assignment1 getInstance() {
		
		//double chcked lock which checks if the singleton is null if it is then creates a new singleton;
		if (singleton == null) {
			synchronized (Assignment1 .class) {
				if (singleton == null) {
					singleton = new Assignment1();
				}
			}	
		}
	return singleton;
	}
	
	
	
}
