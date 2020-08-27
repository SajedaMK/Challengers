package array;

public class MaxValueArray {

	public static void main(String[] args) {
		
		int x[] = {10,12,8,34,50,100,120,-150};
		
		int max = -1;
		
		for (int i = 0; i < x.length; i++) {
			
			if (max<x[i])
				max=x[i];
			
		}
		
		System.out.println(max);

	}

}
