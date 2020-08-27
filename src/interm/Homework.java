package interm;



public class Homework {

      

       int x;
       int y;
       
       void multiplication(){
    	   int mul;
       mul = x*y;
       System.out.println("mul is:" +mul);
       }

 

       void multiplication (int a,int b,int c) {
       int mul;
       mul = a*b*c;
       System.out.println(mul);
       }

      

       void multiplication (double a, double b, double c) {
    	   double mul;
       mul = a*b*c;
       System.out.println(mul);
       }

      

       int division(){
       int div;
       div = x/y;
       return div;
       }

       public static void main(String[] args) { 

 

       Homework c1 = new Homework ();
       c1.x=10;
       c1.y=5;
       c1.multiplication();
       int d1 = c1.division();
       System.out.println("div is:"+d1);

      

      

       Homework c2 = new Homework ();

       c2.x=100;

       c2.y=500;

       c2.multiplication();

       c2.multiplication(120, 100, 150);

       //c2.multiplication(20.75, 12.5, 10.76);

      

             

       }

 

}
