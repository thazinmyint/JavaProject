package oopconcepts;

/**
 * <h2>Animal Class</h2>
 * <p>
 * Process for Displaying Animal
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
abstract class Animals {
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

    abstract public void makeSound();
}

/**
 * <h2>AbstractionMethod Class</h2>
 * <p>
 * Process for Displaying AbstractionMethod
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class AbstractionMethod extends Animals {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animals obj = new AbstractionMethod();
        obj.sleep();
        obj.makeSound();

    }

    /**
     * <h2>makeSound</h2>
     * <p>
     * 
     * </p>
     * 
     */
    @Override
    public void makeSound() {
        System.out.println("meow meow");

    }

}
