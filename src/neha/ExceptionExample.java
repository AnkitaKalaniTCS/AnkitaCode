package neha;

public class ExceptionExample {
public static void main(String[]args)
{
	try {
	//int data=100/0;
	System.out.println(2.0/0);
	}catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Can not divide by zero ");
	}
}
}
