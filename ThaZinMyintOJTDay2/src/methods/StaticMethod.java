package methods;

/**
 * <h2>StaticMethod Class</h2>
 * <p>
 * Process for Displaying StaticMethod
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class StaticMethod {

	// static variable
	static int a = 40;

	/**
	 * <h2>simpleDisplay</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return void
	 */
	void simpleDisplay() {
		System.out.println("simple value " + a);
	}

	// Declaration of a static method.
	/**
	 * <h2>staticDisplay</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return void
	 */
	static void staticDisplay() {
		System.out.println("static value " + a);
	}

	// main method
	public static void main(String[] args) {
		StaticMethod obj = new StaticMethod();
		obj.simpleDisplay();

		// Calling static method.
		staticDisplay();
	}

}
