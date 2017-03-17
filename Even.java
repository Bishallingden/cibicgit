package multithreading;

public class Even extends Thread {
	
	public void run(){
		System.out.println("Printing even number from 0 to 20");
		for(int i =0;i<20;i+=2){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(i);
			
		}
	}

	
	

}
