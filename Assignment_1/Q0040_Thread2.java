package Assignment_1;

class MyThread extends Thread {
	@Override
	public void run() {
		 for (int i = 1; i <= 5; i++) {
			 System.out.println("Thread running: " + i);
			 try {
				 Thread.sleep(1000);
				 } catch (InterruptedException e){
					 System.out.println("Thread interrupted"); 
					 } 
			 
		 }
	}
}

public class Q0040_Thread2 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
	    myThread.start();
	    for (int i = 1; i <= 5; i++) {
	    	System.out.println("Main thread: " + i);
	    	try {
	    		Thread.sleep(1000);
	    		}catch (InterruptedException e) {
	    			System.out.println("Main thread interrupted");
	    	}
	    }
	}
}
