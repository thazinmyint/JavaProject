package accessmodifiers;

/**
 * <h2> PublicAccessModifier Class</h2>
 * <p>
 * Process for Displaying PublicAccessModifier
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class PublicAccessModifier {

    public static void main(String[] args) {
        Second myObj = new Second(); 
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
      }

}
