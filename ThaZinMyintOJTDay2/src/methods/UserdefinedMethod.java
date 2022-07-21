package methods;

/**
 * <h2>UserdefinedMethod Class</h2>
 * <p>
 * Process for Displaying UserdefinedMethod
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class UserdefinedMethod {

	/**
	 * <h2>multiply</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * @return int
	 */
	public int multiply(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}

	public static void main(String[] args) {

		// Create Object
		UserdefinedMethod abc = new UserdefinedMethod();

		// Call Method
		int x = abc.multiply(10, 25, 35);
		System.out.println(x);

	}

}
