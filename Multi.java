package multithreading;

public class Multi extends Thread {
	
	public void run(){
		 System.out.println("This is thread concept");
	}

	public static void main(String[] args) {
		Multi mc = new Multi();
		mc.start();
	}

}
