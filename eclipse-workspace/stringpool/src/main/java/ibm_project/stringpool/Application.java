package ibm_project.stringpool;

	
class Runner implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread()+-->+String.valueOf(c));
		}
	}
}

public class Application
{
	public static void main( String[] args )
	
	
	{
		
			Runner runner = new Runner();
			Thread thread1 = new Thread();
			System.out.println(thread1.getState());
			thread1.start();
			System.out.println(thread1.getState());
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(thread1.getState());
	
		    
		

	}
}