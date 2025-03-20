package Java8Programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachCharCountInAString {
    public static void main(String[] args) {
        String input="Hello World";
        // Approach 1
        Map<Character,Long> charCount=input.replace(" ", "").chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);

        // Approach 2
        Map<String, Long> counterMap=Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(counterMap);

        Map<Character, Long> count=input.replace(" ", "").chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
