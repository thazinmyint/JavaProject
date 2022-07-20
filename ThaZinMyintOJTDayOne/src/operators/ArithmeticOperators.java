package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a, b, c, d, e, f, g;
	    a = 30;
	    b = 20;
	    c = a+b;
	    d = a-b;
	    e = a*b;
	    f = a/b;
	    g = a%b;
//	    h = 0;
	    a = a++;
	    
	    System.out.println("Addition a and b = "+c);
	    System.out.println("Addition a and b = "+d);
	    System.out.println("Multiplication a and b = "+e);
	    System.out.println("Division a and b = "+f);
	    System.out.println("Modulus a and b = "+g);
	    System.out.println("Increment of a = "+ a++);
//	    System.out.println("Decrement of a = "+ a--);
	    

	}

}
