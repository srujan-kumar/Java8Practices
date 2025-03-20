package Java8Programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        // Approach 1
        List<Integer> numbers_list= Arrays.asList(1,6,7,9,3,5, 4,2,6,9,5);
        Set<Integer> dupNumbers=numbers_list.stream().filter(e-> Collections.frequency(numbers_list,e)>1).collect(Collectors.toSet());
        System.out.println("Duplicate Numbers are"+dupNumbers);

        // Count Number and Print that number count --> Collectors.counting()
        List<Integer> numsList=Arrays.asList(1,2,3,5,2,4,3,1,2,2,4,4,5);

                numsList.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting())).forEach((k,v)->{System.out.println(k+" --> "+v);});

    }
}
