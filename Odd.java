package multithreading;

public class Odd extends Thread {
	public void run(){
		System.out.println("Printin odd number from 0 to 20");
		for(int j=1;j<20;j+=2){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.println("\t"+j);
		}
	}

}
