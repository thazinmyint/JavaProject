package oopconcepts;

//Base Class
/**
 * <h2>Parent Class</h2>
 * <p>
 * Process for Displaying Parent
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Parent {
    /**
     * <h2>show</h2>
     * <p>
     * 
     * </p>
     *
     * @return void
     */
    void show() {
        System.out.println("Parent's show()");
    }
}

//Inherited class
/**
 * <h2>Child Class</h2>
 * <p>
 * Process for Displaying Child
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Child extends Parent {
    // This method overrides show() of Parent
    /**
     * <h2>show</h2>
     * <p>
     * 
     * </p>
     * 
     */
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

/**
 * <h2>MethodOverriding Class</h2>
 * <p>
 * Process for Displaying MethodOverriding
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class MethodOverriding {
    public static void main(String[] args) {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}
