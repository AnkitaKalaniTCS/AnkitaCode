package neha;

import java.util.Scanner;

public class AmstExample {
	public static void main(String[] args)
	{
		
		int number;
		int sum=0, n = 0 , temp=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		number=scanner.nextInt();
		temp=number;
		while(n>0)
		{
			n=number%10;
			sum=sum+(n*n*n);
			n=number/10;
			
	    }if(temp==sum) {
		System.out.println("Amstrong number");
	}else {
		System.out.println("not amstrong");
	}	
	}

}
