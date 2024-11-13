import java.util.ArrayList;

public class ConsumerThread implements Runnable {
	private Object lock;	
	  ArrayList<Integer> array;
	  
	  public ConsumerThread(ArrayList<Integer> array) {
		  super();
		  this.array = array;
	  }
	  
	  public void run() {
		 
		  while(true) {
			  synchronized(lock) {
				  try {
				  System.out.println("Consumer started");
				  for(Integer element:array) {
					  System.out.println("Consumer thread consumes = "+array.get(element));
					  
				  }
				  System.out.println("Elements in queue = " + array );
				  Thread.sleep(1000);
				  array.wait();
				  array.notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  }
		  }
	  }
}
