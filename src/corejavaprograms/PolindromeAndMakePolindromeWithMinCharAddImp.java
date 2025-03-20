package corejavaprograms;
/* Ref from https://stackoverflow.com/questions/28001448/converting-a-string-into-a-palindrome-in-java
So for the string "abcd", we would try
1) "" + "abcd" -> "abcd" -> false
2) "d" + "abcd" -> "dabcd" -> false
3) "dc" + "abcd" -> "dcabcd" -> false
4) "dcb" + "abcd" -> "dcbabcd" -> true, terminate
*/

public class PolindromeAndMakePolindromeWithMinCharAddImp {
    public static void main(String[] args) {
        System.out.println("Hello World -->"+checkPalindrome("abba"));
        System.out.println("Hello World -->"+checkPalindrome("abca"));
        System.out.println("Hello World -->"+makePalindrome("abca"));
        System.out.println("Hello World -->"+makePalindrome("abcd"));

    }
    public static boolean checkPalindrome(String s){

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }

        return true;

    }

    public static String makePalindrome(String base) {
        String pref = "";
        int i = base.length() - 1;
        while (!checkPalindrome(pref + base)) {
            pref = pref + base.charAt(i);
            i--;
        }
        return pref + base;
    }
}
