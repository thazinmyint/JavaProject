package controlstatement;

/**
 * <h2>ConditionalStatement Class</h2>
 * <p>
 * Process for Displaying ConditionalStatement
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class ConditionalStatement {

	public static void main(String[] args) {
		// if statement
		int a, b;
		a = 10;
		b = 5;
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// if else statement
		int time1 = 20;
		if (time1 < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}

		// if else if statement
		int time2 = 9;
		if (time2 < 10) {
			System.out.println("Good morning.");
		} else if (time2 < 20) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}

		// switch statement
		int Myday = 6;
		switch (Myday) {
		case 6:
			System.out.println("Today is Thursday");
			break;
		case 7:
			System.out.println("Today is Thursday");
			break;
		default:
			System.out.println("Looking forward to the Weekend");
		}

	}

}
