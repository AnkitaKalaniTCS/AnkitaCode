package neha;

public class Multi3 extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 multi3=new Multi3();
		multi3.start();
		multi3.start();

	}

}
