package variables;

public class NonStaticVariable {

	public int counter = 0;
	public static int staticCounter = 0;
	public NonStaticVariable(){
	      counter++;
	      staticCounter++;
	   }
	public static void main(String args[]) {
		   NonStaticVariable tester = new NonStaticVariable();
		   NonStaticVariable tester1 = new NonStaticVariable();
		   NonStaticVariable tester2 = new NonStaticVariable();
	      System.out.println("Counter: " + tester2.counter);
	      System.out.println("Static Counter: " + tester2.staticCounter);
	   }

}
