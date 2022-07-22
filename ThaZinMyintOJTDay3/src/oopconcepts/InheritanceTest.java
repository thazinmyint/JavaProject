package oopconcepts;

/**
 * <h2>Employee Class</h2>
 * <p>
 * Process for Displaying Employee
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Employee {
    float salary = 40000;
}

/**
 * <h2>InheritanceTest Class</h2>
 * <p>
 * Process for Displaying InheritanceTest
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class InheritanceTest extends Employee {
    int bonus = 10000;

    public static void main(String args[]) {
        InheritanceTest p = new InheritanceTest();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
