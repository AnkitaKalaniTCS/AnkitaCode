package neha;

import java.util.Scanner;

public class AmstrongExample {
	public static void main(String[] args) 
	{
		int n=0, sum=0, temp=0;
		int number;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter a number");
			number=scanner.nextInt();
			temp=number;
		}
		while (number>0) {
			
			
			n=number%10;
			sum=sum+(n*n*n);
			number=number/10;
			
		}
		if (temp==sum) {
			System.out.println("amstrong number");
			
		} else {
			System.out.println("not amstrong");

		}
		
	}

}
