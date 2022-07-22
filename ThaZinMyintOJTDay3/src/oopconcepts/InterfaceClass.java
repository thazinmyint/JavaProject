
package oopconcepts;

/**
 * <h2>anim Class</h2>
 * <p>
 * Process for Displaying Animal
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
interface anim {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
/**
 * <h2>Pig Class</h2>
 * <p>
 * Process for Displaying Pig
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Pig implements anim {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    /**
     * <h2>sleep</h2>
     * <p>
     * 
     * </p>
     * 
     */
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

/**
 * <h2>InterfaceClass Class</h2>
 * <p>
 * Process for Displaying InterfaceClass
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class InterfaceClass {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}