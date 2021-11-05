package com.ss.day4;


public class ProducerConsumer {

	/* test function create a producer that generates numbErs from 1 - 100
	 *  The consumer class will consume the numbers and system log them as they are being consumed.
	 */
	  public static void main(String[] args) {
		    BoundedBuffer buffer = new BoundedBuffer(10); // buffer has size 5
		    Producer prod = new Producer(buffer);
		    Consumer cons = new Consumer(buffer);
		    prod.start();
		    cons.start();
		    try {
		      prod.join();
		      cons.interrupt();
		    } catch (InterruptedException e) {
		    }
		    System.out.println("Test finished");
		  }
	
	
	//Consumer class
	static class Consumer extends Thread {
		private final BoundedBuffer buffer;
		
		
		//constructor takes the bounded buffer
		public Consumer(BoundedBuffer b) {
			buffer = b;                  
		}

		//When called the consumer class will grab the first item in the buffer then go to sleep for a bit
		public void run() {
			try{
				while (true) {
					int n = buffer.get();
					sleep(100);
					System.out.println(n);
				}
			} catch(InterruptedException e){}
		}
	}
	
	
	//Producer class generates numbers 1-100 and puts them in the buffer
	static class Producer extends Thread {
		private final BoundedBuffer buffer;

		public Producer(BoundedBuffer b) {
			buffer = b;
		}

		public void run() {
			try {
				for (int index = 0; index < 100; index ++) {
					buffer.put(index);
					sleep(100);
				}
			} catch (InterruptedException e) {	}
		}
	}
}
