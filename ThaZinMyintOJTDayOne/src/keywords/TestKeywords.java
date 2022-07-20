package keywords;

public class TestKeywords {
	
	static int myMethod(int x) {
	    return 5 + x;
	  }
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	
	private String fname = "John";
	 private String lname = "Doe";
	  private String email = "john@doe.com";
	  private int age = 24;

	public static void main(String[] args) {
		//void keyword
		myMethod();
		
		
		//private keyword
		TestKeywords myObj = new TestKeywords();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    
		//boolean keyword
		boolean a = true;
		boolean b = false;
		System.out.println(a);     
		System.out.println(b);
		
		//break keyword
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			System.out.println(i);
		}
		
		//byte keyword
		byte myNum = 100;
		System.out.println(myNum);
		
		//case keyword
		int day = 3;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		
		//catch keyword
		try {
			  int[] myNumbers = {1, 2, 3};
			  System.out.println(myNumbers[3]);
			} catch (Exception e) {
			  System.out.println("Something went wrong.");
		}
		
	   //char keyword
		char myGrade = 'B';
		System.out.println(myGrade);
		
	  //for keyword
		for (int i = 0; i < 5; i++) {
			  System.out.print(i);
		}
		
	//if keyword
		if (20 > 18) {
			  System.out.println("\n20 is greater than 18");
		}
		
	//instance of keyword
		TestKeywords obj = new TestKeywords();
	    System.out.println(obj instanceof TestKeywords);
		
	//integer keyword
	    int num = 100000;
	    System.out.println(num);
	    
	//long keyword
	    long l = 15000000000L;
	    System.out.println(l);
	
	
	//continue keyword
	for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    continue;
		  }
		  System.out.print(i+ " ");
		}
	
	//default keyword
	int Myday = 4;
	switch (Myday) {
	  case 6:
	    System.out.println("\nToday is wednesday");
	    break;
	  case 7:
	    System.out.println("\nToday is wednesday");
	    break;
	  default:
	    System.out.println("\nLooking forward to the Weekend");
	}
	
	//do keyword
	int i = 0;
	do {
	  System.out.print(i+" ");
	  i++;
	}
	while (i < 5);
	
	
	//double keyword
	double db = 19.99d;
	System.out.println("\n"+db);
	
	//else keyword
	int time = 20;
	if (time < 18) {
	  System.out.println("Good day.");
	} else {
	  System.out.println("Good evening.");
	}
	
	//finally
	try {
		  int[] myNumbers = {1, 2, 3};
		  System.out.println(myNumbers[10]);
		} catch (Exception e) {
		  System.out.println("Something went wrong.");
		} finally {
		  System.out.println("The 'try catch' is finished.");
		}
	
	//float
	float fl = 5.75f;
	System.out.println(fl);
	
	//return
	System.out.println(myMethod(3));
	}
	
	
}

