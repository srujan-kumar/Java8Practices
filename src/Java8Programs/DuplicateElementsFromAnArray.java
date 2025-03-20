package Java8Programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsFromAnArray {
    public static void main(String args[]) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements = listOfIntegers.stream().filter(i -> ! uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateElements);
        // it will print only non duplicate elements
        Set<Integer> uniqueElements2=listOfIntegers.stream().filter(n-> Collections.frequency(listOfIntegers,n)<2).collect(Collectors.toSet());
        System.out.println(uniqueElements2);
        //listOfIntegers.stream().filter(n-> Collections.frequency(listOfIntegers,n)>1).forEach(System.out::println);
        Map<Integer, Long> countMap=listOfIntegers.stream().filter(n-> Collections.frequency(listOfIntegers,n)>1).collect(Collectors.groupingBy(n->n,Collectors.counting()));
        countMap.forEach((k,v)->System.out.println(k+"-->"+v));
    }
}
