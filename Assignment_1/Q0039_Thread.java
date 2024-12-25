package Assignment_1;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread running: " + i);
			try {
				Thread.sleep(1000);
				 }
			catch (InterruptedException e) {
				System.out.println("Thread interrupted"); 
				} 
		}
	}
	
}

public class Q0039_Thread {
	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		Thread thread = new Thread(m);
		thread.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread: " + i); 
			try {
				Thread.sleep(1000);
			 }
			catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
				} 
			}
		}
}
