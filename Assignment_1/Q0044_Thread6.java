package Assignment_1;

class CustomThread extends Thread {
	@Override
	public void run() {
		if (this.isDaemon()) {
			System.out.println(this.getName() + " is a daemon thread.");
			}
		else {
			System.out.println(this.getName() + " is a user thread."); 
			}
		for (int i = 1; i <= 5; i++) {
			System.out.println(this.getName() + " running: " + i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println(this.getName() + " interrupted");
				
		}
		}
	}
}

public class Q0044_Thread6 {
	public static void main(String[] args) {
		CustomThread t1 = new CustomThread();
		CustomThread t2 = new CustomThread();
		// Setting thread names
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		// Making t1 a daemon thread
		t1.setDaemon(true); 
		// Starting the threads 
		t1.start();
		t2.start();
	}
}
