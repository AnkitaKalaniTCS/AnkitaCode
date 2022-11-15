package neha;

public class CustomExceptionEx {
	public static void main(String[] args)
	{
		try {
			OwnException ex=new OwnException();
			throw ex;
			
		}catch (OwnException ex) {
			// TODO: handle exception
			System.out.println("Thrown own exception");
		}
	}
	

}
