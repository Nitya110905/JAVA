package Assignment_1;

class TestMultiPriority extends Thread{
	public void run() {
		 System.out.println("Running thread: " + this.getName());
		 System.out.println("Priority of " + this.getName() + ": " + this.getPriority());
		 try {
			 Thread.sleep(1000);
			 } catch (InterruptedException e) {
				 System.out.println(this.getName() + " interrupted");
		 }
	}
}

public class Q0043_Thread5 {
	public static void main(String[] args) {
		TestMultiPriority m1 = new TestMultiPriority();
		TestMultiPriority m2 = new TestMultiPriority();
		
		m1.setName("My Thread 1");
		m2.setName("My Thread 2");
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		
		m1.start();
		m2.start();
	}
}
