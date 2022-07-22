package accessmodifiers;

/**
 * <h2>DefaultAccessModifier Class</h2>
 * <p>
 * Process for Displaying DefaultAccessModifier
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class DefaultAccessModifier {

    String fname = "ThaZin";
    String lname = "Myint";
    String email = "thazin@gmail.com";
    String address = "Bago";

    public static void main(String[] args) {
        DefaultAccessModifier myObj = new DefaultAccessModifier();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Address: " + myObj.address);
    }

}
