package neha;

public class StringCompareExample {
	public static void main(String[] argString) {
		String s1="Akshay";
		String s2="Akshay";
		String s3=new String("Akshay");
		String s4="Kabra";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s2));
		String s=s1+s4;
		System.out.println(s);
		System.out.println(s1.concat(s2));
	}

}
