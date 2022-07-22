package accessmodifiers;

/**
 * <h2>Person Class</h2>
 * <p>
 * Process for Displaying Person
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Person {
    protected String fname = "ThaZin";
    protected String lname = "Myint";
    protected String email = "thazin@gmail.com";
    protected String address = "Bago";
}

/**
 * <h2>ProtectedAccessModifier Class</h2>
 * <p>
 * Process for Displaying ProtectedAccessModifier
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class ProtectedAccessModifier extends Person {
    private int graduationYear = 2022;

    public static void main(String[] args) {
        ProtectedAccessModifier myObj = new ProtectedAccessModifier();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Address: " + myObj.address);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
