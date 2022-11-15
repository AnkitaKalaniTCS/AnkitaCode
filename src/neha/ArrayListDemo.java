package neha;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main (String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add("A");
		
		a.addAll(a);
		System.out.println(a);
		
	}}