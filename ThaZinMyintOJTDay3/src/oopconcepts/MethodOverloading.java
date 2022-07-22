package oopconcepts;

/**
 * <h2>DisplayOverloading Class</h2>
 * <p>
 * Process for Displaying DisplayOverloading
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class DisplayOverloading {
    /**
     * <h2>disp</h2>
     * <p>
     * 
     * </p>
     *
     * @param c
     * @return void
     */
    public void disp(char c) {
        System.out.println(c);
    }

    /**
     * <h2>disp</h2>
     * <p>
     * 
     * </p>
     *
     * @param c
     * @param num
     * @return void
     */
    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}

/**
 * <h2>MethodOverloading Class</h2>
 * <p>
 * Process for Displaying MethodOverloading
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class MethodOverloading {
    public static void main(String args[]) {
        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp('t', 10);
    }
}
