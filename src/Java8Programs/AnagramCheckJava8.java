package Java8Programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/** An anagram of a string is another string that contains the same characters, only the order of characters can be different.

For example, “abcd” and “dabc” are an anagram of each other. */


public class AnagramCheckJava8 {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (s1.equals(s2))
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
    }
}
