package operators;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,ans1,ans2,ans3;
		
		num1 = 4;
		num2 = 8;
		num3 = 6;
		 
        // 2 bit left shift operation
         ans1 = num1 << 2;
         
         // 2 bit right shift operation
         ans2 = num2 >> 2;
       
         ans3 = num3 >>> 2;
 
        System.out.println("left shift = "+ans1);
        System.out.println("right shift = "+ans2);
        System.out.println("Unsigned Right Shift = "+ ans3);
	}

}
