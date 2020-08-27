package abstraction;

public class MyCalc implements Calc{

	

	@Override
	public void add(int x, int y) {
		int sum= x+y;
		System.out.println(sum);
		
	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
    public static void main(String[] args) {
		MyCalc c1= new MyCalc();
		c1.add(10, 10);

	}
}
