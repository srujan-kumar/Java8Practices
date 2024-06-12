package Java8Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAnArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        // Approach1
        list.stream()
                .sorted(Collections.reverseOrder()) // Method on Stream<Integer>
                .forEach(System.out::println);

        // Approach2
        List<String> stringList = Arrays.asList("A", "D", "B", "E", "C");
        Collections.reverse(stringList);
        System.out.println(stringList);



    }
}
