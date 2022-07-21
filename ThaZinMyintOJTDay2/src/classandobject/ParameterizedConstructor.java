package classandobject;

/**
 * <h2>MyClass2 Class</h2>
 * <p>
 * Process for Displaying MyClass2
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class MyClass2 {
	int x;

	// Following is the constructor
	/**
	 * <h2>Constructor for MyClass2</h2>
	 * <p>
	 * Constructor for MyClass2
	 * </p>
	 * 
	 * @param i
	 */
	MyClass2(int i) {
		x = i;
	}
}

/**
 * <h2>ParameterizedConstructor Class</h2>
 * <p>
 * Process for Displaying ParameterizedConstructor
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class ParameterizedConstructor {

	public static void main(String[] args) {
		MyClass2 t1 = new MyClass2(10);
		MyClass2 t2 = new MyClass2(20);
		System.out.println(t1.x + " " + t2.x);

	}

}
