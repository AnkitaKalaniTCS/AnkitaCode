package neha;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int reverse =0, n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scanner.nextInt();
	    while(number>0) {
	    	n=number%10;
	    	reverse=(reverse*10)+n;
	    	number=number/10;
	    }
System.out.println("Reverse"+reverse);
	}

}
