package oop2;

import oop1.NewAddition;

public class NewMultiplication extends NewAddition{
	
	String name = "Multiplication";
	
	void multiple(int a, int b) {
		int m = a*b;
		System.out.println(m);
	}

	public static void main(String[] args) {
		
		NewMultiplication nm1 = new NewMultiplication();
		nm1.multiple(10, 10);
		nm1.add(100.75,  15.5);

		

	}

}
