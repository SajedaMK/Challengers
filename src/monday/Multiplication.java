package monday;

public class Multiplication extends Subraction{
	
	void multiple(int x, int y) {
		int mul = x*y;
	System.out.println("mul is:"+mul);

	}
	public static void main(String[] args) {
	
		Multiplication m1= new Multiplication();
		m1.multiple(10, 10);
		m1.sub(25, 15);
		
}

}