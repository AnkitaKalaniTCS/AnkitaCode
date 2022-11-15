package neha;

public class SleepExample extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepExample sleepExample=new SleepExample();
		SleepExample s2=new SleepExample();
		sleepExample.start();
		s2.start();

	}

}
