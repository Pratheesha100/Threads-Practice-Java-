import java.util.ArrayList;

public class ProducerThread implements Runnable {
  private Object lock;	
  ArrayList<Integer> array;
  
  public ProducerThread(ArrayList<Integer> array) {
	  super();
	  this.array = array;
  }
  
  public void run() {
	  int x = 10;
	  
	  while(true) {
		  synchronized(lock) {
			  try {
			  System.out.println("Producer started");
			  array.add(x);
			  System.out.println("Producer adding value = "+x+" to queue" );
			  x += 10;
			 
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
