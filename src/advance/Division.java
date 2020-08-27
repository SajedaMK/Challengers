package advance;

public class Division {

	 double division(double x,double y) {
		 double d=x/y;
		 return d;
		 
	 }
	public static void main(String[] args) {
		Division d1= new Division();
		double div= d1.division(10.5, 2.5);
		System.out.println("Divide x/y,"+div);

	}

}
