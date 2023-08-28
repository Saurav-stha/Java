class NewThread implements Runnable{
	String name;
	Thread t;
	NewThread(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("NEw thread.. "+t);
		t.start();
	}
	public void run(){
		try{
			for(int i=4;i>0;i--){
				System.out.println(name+";" +i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e){
			System.out.println(name+" is interrupted..");
		}
		System.out.println(name+" exiting...");
	}
}
class MultiThreadDemo{
	public static void main(String args[]){
			new NewThread("one");
			new NewThread("two");
			new NewThread("three");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
					System.out.println("main thread interrupted");
			}
			System.out.println("Exiting main thread");
	}
}