package keywords;

class Animals { // Superclass (parent)
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Dog extends Animals { // Subclass (child)
	  public void animalSound() {
	    super.animalSound(); // Call the superclass method
	    System.out.println("The dog says: bow wow");
	  }
	}

	public class SuperKeyword {
	  public static void main(String args[]) {
	    Animals myDog = new Dog(); // Create a Dog object
	    myDog.animalSound(); // Call the method on the Dog object
	  }
	}
