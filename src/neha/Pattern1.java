package neha;

import java.util.Iterator;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		for(i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
