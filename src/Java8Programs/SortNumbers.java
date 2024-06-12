package Java8Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5,-1, 0,7,1,9,13,16);
        List<Integer> ascendingOrderList=numbers_list.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingOrderList=numbers_list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Ascending Order sort --> "+ascendingOrderList);
        System.out.println("Descending Order sort --> "+descendingOrderList);


    }
}
