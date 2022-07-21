package methods;

/**
 * <h2>Sum Class</h2>
 * <p>
 * Process for Displaying Sum
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
abstract class Sum {
	/*
	 * These two are abstract methods, the child class must implement these methods
	 */
	public abstract int sumOfTwo(int n1, int n2);

	public abstract int sumOfThree(int n1, int n2, int n3);

	// Regular method
	/**
	 * <h2>disp</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return void
	 */
	public void disp() {
		System.out.println("Method of class Sum");
	}
}

/**
 * <h2>AbstractMethod Class</h2>
 * <p>
 * Process for Displaying AbstractMethod
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class AbstractMethod extends Sum {

	/**
	 * <h2>sumOfTwo</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int sumOfTwo(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * <h2>sumOfThree</h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int sumOfThree(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static void main(String args[]) {
		Sum obj = new AbstractMethod();
		System.out.println(obj.sumOfTwo(3, 7));
		System.out.println(obj.sumOfThree(4, 3, 19));
		obj.disp();
	}
}