package interm;

public class swap {

	public static void main(String[] args) {
		int x=10;
		int y=15;
		x=y;
		x=x+y;
		y=x-y;
		x-=x-y;
    System.out.println("x="+x+" and "+"y="+y);
	}

}
