package neha;

public class TestEx {
	
		public static void main (String[]args) {
			try {
			CustomExceptionExample customExceptionExample=new CustomExceptionExample();
			throw customExceptionExample;
			}
			catch (CustomExceptionExample e) {
				// TODO: handle exception
				System.out.println("Created own exception");
			}
		}
	

}
