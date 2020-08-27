package oop;

public class Subraction extends Addition{

	void sub(int x,int y) {
		int s = x-y;
		System.out.println("Subtraction of two numbers:"+s);
	}
	void sub(double x, double y) {
		double s= x-y;
		System.out.println("Subraction of two numbers:"+s);
	}
	
	void add(int a, int b, int c) {
		int sum = a+b+c+5;
		System.out.println(sum);
	}
	
	public static void main(String [] args) {
		Subraction s1 = new Subraction();
		s1.sub(100, 75);
		s1.add(10,10);
		s1.add(5, 5, 5);
}
}