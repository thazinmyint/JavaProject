package operators;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cond=true;
		int a,b,c,d;
		a = 10;
		b = 20;
		c = 30;
		d=30;
		
		System.out.println("logical AND operator => " + (a!=b && c==d));
		
		System.out.println("logical OR operator => "+(a==b || c==d));
		
		System.out.println("logical NOT operator = "+ !cond);
		

	}

}

