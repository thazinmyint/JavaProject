package classandobject;

/**
 * <h2>Puppy Class</h2>
 * <p>
 * Process for Displaying Puppy
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class Puppy {

	/**
	 * <h2>Constructor for Puppy</h2>
	 * <p>
	 * Constructor for Puppy
	 * </p>
	 * 
	 * @param name
	 */
	public Puppy(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :" + name);
	}

	public static void main(String[] args) {
		// Following statement would create an object myPuppy
		Puppy myPuppy = new Puppy("tommy");
	}
}
