package basic;

public class DesicionMaking {

	public static void main(String[] args) {
		//examples 
		//int x= ?;
		//int y= ?;
		//x is bigger, y is bigger, both saame , error
		//if .... else if... else condition 
		

		int x= 15;
		int y= 25;
		
		if(x>y)
			System.out.println("x is bigger");
		else if(y>x)
			System.out.println("y is bigger");
		else if(x==y)
			System.out.println("both same");
		else
			System.out.println("error");
		
		

	}

}
