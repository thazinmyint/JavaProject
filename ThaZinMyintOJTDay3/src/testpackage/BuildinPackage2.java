package testpackage;

import java.util.Arrays;

/**
 * <h2>BuildinPackage2 Class</h2>
 * <p>
 * Process for Displaying BuildinPackage2
 * </p>
 * 
 * @author ThaZinMyint
 *
 */

public class BuildinPackage2 {
    public static void main(String args[]) {
        int[] arr = { 40, 30, 20, 70, 80 };
        Arrays.sort(arr);
        System.out.printf("Sorted Array is = " + Arrays.toString(arr));
    }
}
