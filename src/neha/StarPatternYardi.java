package neha;

public class StarPatternYardi {

	public static void main(String[] args) {
		
		int n=6,i,j,k;
		for(i=0;i<=n;i++) 
		{
			
			for(j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
