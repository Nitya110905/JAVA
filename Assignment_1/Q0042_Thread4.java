package Assignment_1;

class test_Thread extends Thread {
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


public class Q0042_Thread4 {
	public static void main(String[] args) {
		test_Thread T1 = new test_Thread();
	    T1.start();
	    T1.start();
	}
}
