package keywords;

class Vehicle {
	  protected String brand = "Ford";         // Vehicle attribute
	  public void honk() {                     // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	}

	class ExtendKeyword extends Vehicle {
	  private String modelName = "Mustang";    // Car attribute
	  public static void main(String[] args) {

		  ExtendKeyword myCar = new ExtendKeyword();

	    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.honk();
	    
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
	}
