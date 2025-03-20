package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// distinct example
public class RemovingDuplicateElementsFromList {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(1,6,7,9,3,5, 4,2,6,9,5);
        numbers_list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
