package Practical_09;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running (Running State)");
		try {
			Thread.sleep(2000);//Thread Waiting State
			System.out.println("Thread woke up(Back to Runnable or Running)");
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted.");
		}
		System.out.println("Thread is Exiting(Terminated State)");
	}


	public static void main(String[] args) {
		MyThread t = new MyThread();//New State
		System.out.println("Thread created but started (New State)");
		t.start();//Runnable State
		System.out.println("Thread started (Runnable State)");
		System.out.println("Is thread alive?" + t.isAlive());
		
		try {
			t.join();//Main thread waits for t to complete
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}

	}
	
}
