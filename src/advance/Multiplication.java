package advance;

import oop.Addition;

public class Multiplication extends Addition{

	//Encapsulation -- Encapsulation in Java is a process of wrapping code and data together into a single unit,
	//for example, a capsule which is mixed of several medicines.  We can create a fully encapsulated class in Java by making all the data members of the class private.
	//Access modifiers 1.private, 2.default ,3. public, 4.protected.
	//class level
	//package level- default, protected
	//project level- public
	//protected is accessible outside of the package if inherited.
	
	void multiple(int x, int y) {
		int m= x*y;
		System.out.println("Multiple of two numbers:" +m);
	}
	
	void multiple(double x, double y) {
		double m=x*y;
		System.out.println("Multiple of two doubles:"+m);
	}
	public static void main(String[] args) {
		Multiplication m1= new Multiplication();
		m1.multiple(10.5, 20.5);
		m1.multiple(10, 30);
		

	}

}
