package StringProgramms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinMethodExample {
    public static void main(String[] args) {
        // Approach1
        String arr[] = {"B", "M", "W"}; // I need O/P to be B:M:W or B|M|W
        String result = String.join(":", arr);
        System.out.println("Result String" + result);

        // Approach2
        String joinString=Arrays.asList("A", "E", "I", "O", "U").stream().collect(Collectors.joining("|"));
        System.out.println("Join String" + joinString);
    }
}
