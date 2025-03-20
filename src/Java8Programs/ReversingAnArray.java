package Java8Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReversingAnArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        // Approach1
        list.stream()
                .sorted(Collections.reverseOrder()) // Method on Stream<Integer> understand when to use Collections.reverseOrder vs Compararor.reverseOrder
                .forEach(System.out::println);

        // Reversing array
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

        System.out.println(Arrays.toString(reversedArray));


        // Approach2
        List<String> stringList = Arrays.asList("A", "D", "B", "E", "C");
        Collections.reverse(stringList);
        System.out.println(stringList);



    }
}
