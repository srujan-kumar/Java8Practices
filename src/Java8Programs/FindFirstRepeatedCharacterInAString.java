package Java8Programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstRepeatedCharacterInAString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> charSet=new HashSet<String>();
        String firstRepeatedCharacter=Stream.of(inputString.split("")).filter(ch->!charSet.add(ch)).findFirst().get();
        System.out.println(firstRepeatedCharacter);

        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println("First Repeated Char"+firstRepeatedChar);

        // find all repeated Characters In A string ****
        Stream.of(inputString.split("")).filter(ch->!charSet.add(ch)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
