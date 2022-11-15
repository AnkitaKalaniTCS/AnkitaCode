package neha;

import java.util.Scanner;

public class FactoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int f=1;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number");
			num=scanner.nextInt();
		}
		for(int i=1;i<=num;i++)
		{
			f=f*i;
	    }
		System.out.println(f);

	}

}
