package sunday;

import tuesday.Calc;

public class Addition implements Calc{

	
	public static void main(String[] args) {
		Addition c1= new Addition();
		c1.add(10, 15, 20);
		

}

	@Override
	public void add(int x, int y) {
		int sum=x+y;
		System.out.println("Sum of two intergers:"+sum);
		
	}

	@Override
	public void add(double x, double y) {
		double sum=x+y;
		System.out.println("Sum of two numbers:"+sum);
		
	}

	@Override
	public void add(int x, int y, int z) {
		int sum=x+y+4;
		System.out.println("Sum of three intergers:"+sum);
		
	}
	void add(double x, double y, double z) {
		double sum= x+y+z;
		System.out.println("Sum of three intergers:"+sum);
	}
	protected void add( int a, int b, int c, int d) {
		int add= a+b+c+d;
		System.out.println(add);
	
	}
}