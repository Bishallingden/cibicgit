package multithreading;

public class DemoTest extends Thread {
	
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		DemoTest dt = new DemoTest();
		dt.start();

	}

}
