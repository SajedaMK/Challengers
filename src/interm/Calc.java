package interm;

public class Calc {
	// method is a block of code that performs certain actions. purpose of method is to make it REUSEABLE
	
	int x;
	int y;
	
	// return type method name () {   }
	
	void addition() {
		int sum;
		sum = x+y ;
		System.out.println("sum is: "+sum);
	}// end of addition
	
	int subtraction() {
		int sub;
		sub=x-y;
		return sub;
	}
	
	void multiplication() {
		int mul;
		mul=x*y;
		System.out.println("mul is: "+mul);
	}
	
	int division() {
		int div;
		div=x/y;
		return div;
		
	}
	

	public static void main(String[] args) {
		
		//class name obj name = new class name();
		Calc c1 = new Calc();
		c1.x = 10;
		c1.y = 15;
		c1.addition();
		int s1= c1.subtraction();
		System.out.println("sub is:"+s1);
		
		Calc c2 = new Calc();
		c2.x = 100;
		c2.y = 155;
		c2.addition();
		
		Calc c3 = new Calc();
		c3.x= 100;
		c3.y= 5;
		c3.multiplication();
		int d1=c3.division();
		System.out.println("div is:"+d1);

}
}
// the scope of local variable is within the method only .
// the scope of a instance variable is within the object .
// a class is a blueprint .
// same method name multiple types as long as the diff number of paremeters & if (method over loading)