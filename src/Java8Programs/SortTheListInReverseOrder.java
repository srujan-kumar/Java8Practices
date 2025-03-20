package Java8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTheListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5,-1, 0,7,1,9,13,16);
        numbers_list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
