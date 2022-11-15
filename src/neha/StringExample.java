package neha;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original, reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string");
		original=in.nextLine();
		int lenght=original.length();
		for(int i=lenght-1; i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		
		if(original.equals(reverse)) {
			System.out.println("palendrom string");}
		else {
			System.out.println("not palendrom");
		}

	}

}
