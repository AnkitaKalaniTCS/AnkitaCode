package neha;

public class MultiTEx implements Runnable {
	public void run() {
		System.out.println("thread is running in part of process");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTEx m= new MultiTEx();
		Thread thread= new Thread(m);
		thread.start();

	}
}