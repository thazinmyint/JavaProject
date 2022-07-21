package methods;

/**
 * <h2>NonstaticMethod Class</h2>
 * <p>
 * Process for Displaying NonstaticMethod
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class NonstaticMethod {

	public static void main(String[] args) {
		// Input integers to be summed up
		int n = 3, m = 6;

		// Creating object of above class
		Helper g = new Helper();

		// Calling above method to compute sum
		int s = g.sum(n, m);

		// Calling the non-static method
		System.out.print("sum is = " + s);
	}
}

/**
 * <h2>Helper Class</h2>
 * <p>
 * Process for Displaying Helper
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Helper {

	// Non-static method
	public int sum(int a, int b) {
		// Returning sum of numbers
		return a + b;
	}
}
