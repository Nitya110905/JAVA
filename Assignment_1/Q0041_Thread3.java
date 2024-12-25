package Assignment_1;


class Thread1 extends Thread {
	@Override
	public void run() {
		 for (int i = 1; i <= 5; i++) {
			 System.out.println("Thread 1: " + i);
			 try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e){
					 System.out.println("Thread 1 interrupted"); 
					 } 
			 
		 }
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		 for (int i = 1; i <= 5; i++) {
			 System.out.println("Thread 2: " + i);
			 try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e){
					 System.out.println("Thread 2 interrupted"); 
					 } 
			 
		 }
	}
}
public class Q0041_Thread3 {
	public static void main(String[] args) {
		Thread1 T1 = new Thread1();
	    T1.start();
		Thread2 T2 = new Thread2();
	    T2.start();
	    for (int i = 1; i <= 5; i++) {
	    	System.out.println("Main thread: " + i);
	    	try {
	    		Thread.sleep(2000);
	    		}catch (InterruptedException e) {
	    			System.out.println("Main thread interrupted");
	    	}
	    }
	}

}
