package oop;

public class Addition {

	public String ops="Addition";
	
	private void add(int a,int b) {
	int sum = a+b;
	System.out.println("Sum of two numbers:"+sum);
	}
	
	protected void add(double a, double b) {
		double sum;
		sum = a+b;
		System.out.println("Sum of two double:"+sum);
	}
	
	void add(int a,int b, int c) {
		int sum= a+b+c;
		System.out.println("Sum of three numbers:"+sum);
	}// default modifiers .

	public static void main(String[] args) {
	
		Addition a1= new Addition();
				a1.add(10.5,20.75);
a1.add(10, 10);

}
}