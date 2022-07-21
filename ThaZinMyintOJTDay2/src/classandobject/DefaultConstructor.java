package classandobject;

/**
 * <h2>MyClass Class</h2>
 * <p>
 * Process for Displaying MyClass
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class MyClass {
	int num;

	MyClass() {
		num = 100;
	}
}

/**
 * <h2>DefaultConstructor Class</h2>
 * <p>
 * Process for Displaying DefaultConstructor
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		System.out.println(t1.num + " " + t2.num);

	}

}
