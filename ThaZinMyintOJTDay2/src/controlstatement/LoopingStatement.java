package controlstatement;

/**
 * <h2>LoopingStatement Class</h2>
 * <p>
 * Process for Displaying LoopingStatement
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class LoopingStatement {

	public static void main(String[] args) {
		// for loop
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// for-each loop
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}
		System.out.print("\n");

		// while loop
		int i = 0;
		while (i < 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n");

		// do while loop
		int j = 0;
		do {
			System.out.print(j + " ");
			j++;
		} while (j < 5);
	}

}
