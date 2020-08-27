package array;

public class DemoArray {

	public static void main(String[] args) {
		
		int x[] = {10,12,8,34,50};
		System.out.println();
		
		//array has a lenght
		//array values has indexes -- starts with 0
		//max index of an array is lenght 
		
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[x.length-1]);
		
		String[] names = {"iqbal","fatema","Sajeda"};
		
		System.out.println(names[0]);
		System.out.println(names.length-1);
		
	}

}
