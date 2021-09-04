package oop1;

public class NewAddition {
	
	static String name = "Addition";
	
	//method overloading -- compile time polymorphism
	
	void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	protected void add(double a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}
	
	private void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		NewAddition na1 = new NewAddition();
		System.out.println(na1.name);
		na1.add(10, 10);
		na1.add(20.75,  20.75);
		na1.add(10, 10, 10);
		

	}

}
