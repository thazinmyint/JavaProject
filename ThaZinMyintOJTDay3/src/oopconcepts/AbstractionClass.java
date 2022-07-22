package oopconcepts;

/**
 * <h2>Animal Class</h2>
 * <p>
 * Process for Displaying animal
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
abstract class Animal {
    // abstract method
    /**
     * <h2>sleep</h2>
     * <p>
     * 
     * </p>
     *
     * @return void
     */
    public void sleep() {
        ;
        System.out.println("zzz");
    }
}

/**
 * <h2>AbstractionClass Class</h2>
 * <p>
 * Process for Displaying Abstraction
 * </p>
 * 
 * @author ThaZinMyint
 *
 */

public class AbstractionClass extends Animal {

    public static void main(String args[]) {
        Animal obj = new AbstractionClass();
        obj.sleep();
    }
}
