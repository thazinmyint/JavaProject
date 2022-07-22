package accessmodifiers;

/**
 * <h2>PrivateAccessModifier Class</h2>
 * <p>
 * Process for Displaying PrivateAccessModifier
 * </p>
 * 
 * @author user
 *
 */
public class PrivateAccessModifier {

    private String fname = "ThaZin";
    private String lname = "Myint";
    private String email = "thazin@gmail.com";

    public static void main(String[] args) {
        PrivateAccessModifier myObj = new PrivateAccessModifier();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
    }

}
