package controlstatement;

/**
 * <h2>JumpStatement Class</h2>
 * <p>
 * Process for Displaying JumpStatement
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class JumpStatement {

	/**
	 * <h2>CompareNum</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return int
	 */
	public int CompareNum() {
		int x = 3;
		int y = 8;
		System.out.println("x = " + x + "\ny = " + y);
		if (x > y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {

		// break
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// continue
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.print(i + ",");
		}
		System.out.println("\n");

		// return
		JumpStatement obj = new JumpStatement();
		int result = obj.CompareNum();
		System.out.println("The greater number among x and y is: " + result);

	}

}
