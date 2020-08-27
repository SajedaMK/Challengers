package monday;

import sunday.Addition;

public class Subraction extends Addition{

	
	void sub(int x,int y ) {
		int s;
		if(x>y)
			s = x-y;
		else 
			s = y-x;
		System.out.println("The sub is:"+s);
	}
	
	public void add(int x, int y) {
		int sum =x+y+4;
		System.out.println("sum of two number is:"+sum);
	}
	 private void sub(int x, int y, int z) {
		 int s= x-y-z;
		 System.out.println("sub of three numbers:"+s);
	 }
	
	
	public static void main(String[] args) {
		Subraction s1 = new Subraction();
		s1.add(10, 10);
		s1.add(10, 15);
		s1.add(10, 10, 10);
		s1.sub(10, 20, 30);

	}

}

