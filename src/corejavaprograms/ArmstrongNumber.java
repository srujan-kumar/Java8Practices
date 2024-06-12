package corejavaprograms;

import java.util.Scanner;

public class ArmstrongNumber {
    //153 --> 1 power3+5 power+3 power3 = 153
    //9474 --> 9 power 4+4 power 4+7 power 4_ 4 power 4=9474
    // ***** For Armstrong number power value is the count of the digits of your number
    public static void main(String[] args) {
        System.out.println(isArmstrong(143));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(1634));
    }

    public static boolean isArmstrong(int n) {
        // Step 1: Convert the number to a string to access its individual digits
        String numStr = Integer.toString(n);
        // Step 2: Get the number of digits in the number
        int numDigits = numStr.length();
        // Step 3: Initialize a variable to store the sum of the digits raised to the power of the number of digits
        int armstrongSum = 0;
        // Step 4: Iterate over each digit in the number
        for (int i = 0; i < numDigits; i++) {
            // Step 4a: Convert the digit from a string to an integer
            int digit = Integer.parseInt(Character.toString(numStr.charAt(i)));
            // Step 4b: Raise the digit to the power of the number of digits and add it to the armstrongSum
            armstrongSum += Math.pow(digit, numDigits);
        }
        // Step 5: Compare the original number to the armstrongSum
        if (armstrongSum == n) {
            return true;
        } else {
            return false;
        }
    }
}