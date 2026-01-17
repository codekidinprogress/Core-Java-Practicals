package Practical_10;

class MyRunnable implements Runnable { 
	 private String threadName;
	 MyRunnable(String name){
		 this.threadName = name;
	 } 
	 public void run() {
		 for(int i=1; i<=5; i++) {
			 System.out.println(threadName + " is running: " + i);
			 try {
				 Thread.sleep(400);//Sleep for 0.4 seconds
			 }
			 catch(InterruptedException e) {
				 System.out.println(threadName + "was interrupted.");
			 }
		 }
	 }
	public static void main(String[] args) {
		
		//Created Runnable objects
		MyRunnable r1 = new MyRunnable("Worker-1");
		MyRunnable r2 = new MyRunnable("Worker-2");
		
		//Create Thread objects and pass Runnable instances
		Thread t1 = new Thread (r1);
		Thread t2 = new Thread (r2);
		
		//Start Thread
		t1.start();
		t2.start();
		
	}

}

