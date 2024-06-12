package corejavaprograms;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        System.out.println(isAnagram("Rat", "Art"));
        System.out.println(isAnagram("Cat", "Act"));
        System.out.println(isAnagram("Listen", "Silent"));
        System.out.println(isAnagram("Toss", "Shot"));
        System.out.println(isAnagram("Joy", "Enjoy"));

    }

    public static boolean isAnagram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");
        if (str1.length() != str2.length()) return false;
        else {
            char c1[] = str1.toLowerCase().toCharArray();
            char c2[] = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }
    }
}
