package array;

public class MinValueArray {
	

	public static void main(String[] args) {
		
		int x[] = {10,12,8,34,50,100,120,-150};
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < x.length; i++) {
			
			if (min>x[i])
				min=x[i];
			
		}
		
		System.out.println(min);

	}

}

