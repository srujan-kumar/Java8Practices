package Java8Programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(1,6,7,9,3,5, 4,2,6,9,5);
        Set<Integer> dupNumbers=numbers_list.stream().filter(e-> Collections.frequency(numbers_list,e)>1).collect(Collectors.toSet());
        System.out.println("Duplicate Numbers are"+dupNumbers);
    }
}
