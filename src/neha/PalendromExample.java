package neha;

import java.util.Scanner;

public class PalendromExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,rev = 0, sum=0;
		int temp=0;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scanner.nextInt();
		temp=n;
		while(n<0) {
			r=n%10;
		    rev=(rev*10)+r;
		    n=n/10;
			}
		if (temp==rev) {
			System.out.println("palendrome");
			
		} else {
			System.out.println("not palendrome");

		}

	}

}
