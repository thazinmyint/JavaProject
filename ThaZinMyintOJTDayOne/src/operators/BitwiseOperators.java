package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 7;
        
        
        System.out.println("a&b = " + (a & b));
 
        System.out.println("a|b = " + (a | b));
 
        System.out.println("a^b = " + (a ^ b));
 
        System.out.println("~a = " + ~a);
 
        a &= b;
        System.out.println("a = " + a);
	}

}
