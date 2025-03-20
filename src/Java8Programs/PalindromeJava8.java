package Java8Programs;

import java.util.stream.IntStream;

public class PalindromeJava8 {
    public static void main(String[] args) {
        String str = "ROTATOR";
        //String str = "123321";

        // Approach1
        boolean isItPalindrome = IntStream.range(0, str.length() / 2).
                noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if (isItPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        // Approach2 **** Refer this
        int bp = str.length() - 1;

        boolean polindromeCheck=IntStream.range(0, str.length()).allMatch(position -> str.charAt(position) == str.charAt(bp - position));
        if(polindromeCheck) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        // position=0,bp-position=6
        //position=1,bp-position=5
        // position=2,bp-position=4
        // position=3,bp-position=3
        //// position=4,bp-position=2


    }
        // using String Builder ***
    public static boolean isPalindrome(int number) {
        String str = "ROTATOR";
        boolean palindromeCheck=String.valueOf(str).equals(new StringBuilder(String.valueOf(str)).reverse().toString());
        return palindromeCheck;
    }
}
