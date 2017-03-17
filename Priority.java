package multithreading;

public class Priority extends Thread{
	
	public void run(){
		System.out.println("Thread prority is.."+ Thread.currentThread().getPriority());
		System.out.println("Thread Name is.." + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Priority p = new Priority();
		Priority p1 = new Priority();
		p.setPriority(10);
		p1.setPriority(MIN_PRIORITY);
		p.setName("multiple");
		p1.setName("short");
		p.start();
		p1.start();
	}

}
