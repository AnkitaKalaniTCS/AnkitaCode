package neha;

public class MultiExample extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] aStrings) {
		MultiExample multiExample=new MultiExample();
		multiExample.start();
	}
	

}
