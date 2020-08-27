package array;

public class Prime {

	public static void main(String[] args) {
		
		int x = 17;
		boolean isPrime = true;
		
		for(int i=2; i<x; i++) {
			if(x%i==0) {
				isPrime= false;
				break;
				
			}
		}
		
          if(isPrime=true)
	System.out.println("it is prime number");
          else
	System.out.println("it is not prime number");

	}

}
