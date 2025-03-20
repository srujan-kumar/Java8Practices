package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VowelConsonantCounterJava8Imp {
    public static void main(String[] args) {

        String input ="Hello World";

        // Step 2: Normalize the String
        input = input.toLowerCase();

        // Step 3: Define the sets of vowels
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        // Step 4: Filter and Count Vowels
        long vowelCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains).distinct()
                .count();

        long consonantCounter = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c->!vowels.contains(c)).distinct()
                .count();
        System.out.println("Consoant Count"+consonantCounter);

        // Step 5: Filter and Count Consonants
        Predicate<Character> isAlphabet = c -> c >= 'a' && c <= 'z';
        long consonantCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(isAlphabet.and(c -> !vowels.contains(c))).distinct()
                .count();

        // Step 6: Output the Result
        System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);
    }
}

