package multithreading;

public class Test implements Runnable {
	
	public static void main(String[] args) {
		
		Test tc = new Test();
		Thread t1 = new Thread(tc);
		t1.start();
        
        
	}

	@Override
	public void run() {
		System.out.println("Implement method");	
		
	}

}
