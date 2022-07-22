package oopconcepts;

/**
 * <h2>EncapsulationTest Class</h2>
 * <p>
 * Process for Displaying EncapsulationTest
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class EncapsulationTest {

    public static void main(String[] args) {
        // creating instance of Account class
        Account acc = new Account();
        // setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("thazin");
        acc.setEmail("thazin@gmail.com");
        acc.setAmount(200000f);
        // getting values through getter methods
        System.out.println(acc.getAcc_no() + "\n" + acc.getName() + " \n" + acc.getEmail() + " \n" + acc.getAmount());
    }

}

/**
 * <h2>Account Class</h2>
 * <p>
 * Process for Displaying Account
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
class Account {
    // private data members
    private long acc_no;
    private String name, email;
    private float amount;

    // public getter and setter methods
    /**
     * <h2>getAcc_no</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return long
     */
    public long getAcc_no() {
        return acc_no;
    }

    /**
     * <h2>setAcc_no</h2>
     * <p>
     * 
     * </p>
     *
     * @param acc_no
     * @return void
     */
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    /**
     * <h2>getName</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * <h2>setName</h2>
     * <p>
     * 
     * </p>
     *
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h2>getEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * <h2>setEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return void
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <h2>getAmount</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return float
     */
    public float getAmount() {
        return amount;
    }

    /**
     * <h2>setAmount</h2>
     * <p>
     * 
     * </p>
     *
     * @param amount
     * @return void
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

}