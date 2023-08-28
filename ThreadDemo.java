
class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t=new Thread(this,"Name of Thread..");
		System.out.print("Child Thread"+t);
		t.start();
	}

	public void run(){
		try{
			for(int i=3;i>=1;i--){
				System.out.println("Child Thread"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Child is interrupted...");
		}
		System.out.println("Exiting child thread....");
	}
}
class ThreadDemo{
	public static void main(String [] args){
		new NewThread();
		try{
			for(int i=3;i>0;i--){
				System.out.println("main thread .. "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main thread is interrupted..");
		}
		System.out.println("Exiting main thread..");
	}
}