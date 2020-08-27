package basic;

public class Subtraction {
	
	int x;
	int y;
	
	void subtraction() {
		int sub=0;
		if(x>y)
			sub = x-y;
		else if (y>x)
			sub = y-x;
		else if(x==y)
			System.out.println("same value");
		else
			System.out.println("ERROR");
		System.out.println(sub);
	}
	
	void subtraction(int a, int b, int c) {
		int sub = a-b-c;
		System.out.println(sub);
	}
	
	void subtraction(double a, double b, double c) {
		double sub = a-b-c;
		System.out.println(sub);
	}
	
	double CalcInt(double fedRate) {
		double interest = fedRate*.50;
		return interest;
	}
	
	void monthlyPayment(double interest) {
		double mPay = 12*interest;
		System.out.println(mPay);
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("This class does subtraction only");
		
		Subtraction s1 = new Subtraction();
		s1.subtraction(100, 50, 25);
		s1.x=10;
		s1.y = 10;
		s1.subtraction();
		double myInt = s1.CalcInt(7.5);
		s1.monthlyPayment(myInt);
		

	}

}