package neha;

public class ThrowExample {
	public static void validate(int age)
	{
		if(age<18) {
			throw new ArithmeticException("not eligible for vote");
		}
		else {
			System.out.println("eligible");
		}
		
	}
	public static void main(String[] args) {
		validate(18);
		System.out.println("rest of the code");
	}

}
