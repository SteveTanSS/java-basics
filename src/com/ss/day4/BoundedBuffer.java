package com.ss.day4;

public class BoundedBuffer {
	   protected int numSlots;              
	   private int[] buffer;  
	   private int takeOut = 0, putIn = 0; 
	   private int count=0;                
	   
	  // Create a new buffer with the number of slots given
	   public BoundedBuffer(int numSlots) { 
	      if(numSlots <= 0) {
	         throw new IllegalArgumentException("numSlots =< 0");
	      } 
	      this.numSlots = numSlots; 
	      buffer = new int[numSlots];
	   }
	   
	   //Add an item to the back of the bounded buffer block if full

	   public synchronized void put(int value) throws InterruptedException {
	      while (count == numSlots) 
	        wait();
	      buffer[putIn] = value;
	      putIn = (putIn + 1) % numSlots;
	      count++;
	      notifyAll();
	   }

	   // Remove an item from the front of the bounded buffer wait if empty
	   public synchronized int get() throws InterruptedException {
	      while (count == 0) 
	        wait();
	      int value = buffer[takeOut];
	      takeOut = (takeOut + 1) % numSlots;
	      count--;
	      notifyAll();
	      return value;
	   }
	}