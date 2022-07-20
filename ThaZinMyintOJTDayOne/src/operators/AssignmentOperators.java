package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,f,g,h,i;
		a = 30;
		b = 20;
		d = 10;
		e = 30;
		f = 40;
		g = 50;
		h = 10;
		i = 50;
		
		
		c = a+b;
		d += a;
		e -= b;
		b *=a;
		f /= a;
		g %= a;
		h <<= 2;
		i >>= 2;
		System.out.println("simple assignment operator = "+c);
		System.out.println("add assignment operator = "+d);
		System.out.println("subtract assignment operator = " +e);
		System.out.println("multiply assignment operator = " +b);
		System.out.println("divide assignment operator = " +f);
		System.out.println("Modulus assignment operator = " +g);
		System.out.println("left shift assignment operator = " + h);
		System.out.println("right shift assignment operator = " + i);
		System.out.println("Bitwise AND assignment operator = " + h);

	}

}
