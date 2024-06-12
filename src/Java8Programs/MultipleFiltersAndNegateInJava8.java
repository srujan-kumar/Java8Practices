package Java8Programs;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MultipleFiltersAndNegateInJava8 {
    public static void main(String[] args) {
        List<Integer> numbersList=List.of(0,10,20,30,40,50,60,70,80,90,100);
        // get numbers >40 and <80
        numbersList.stream().filter(n->n>40).filter(n->n<80).collect(Collectors.toList()).forEach(System.out::println);

        // *** use "and"/"Or" in filters
        Predicate<Integer> filter1=no->no>40;
        Predicate<Integer> filter2=no->no<80;
        numbersList.stream().filter(filter1.and(filter2)).collect(Collectors.toList()).forEach(System.out::print);

        //negate will print the Opposit result to filter,
        // in our filter example we asked >40, but if we use negate it will print all numbers less than 40

        numbersList.stream().filter(filter1.negate()).collect(Collectors.toList()).forEach(System.out::print);
    }
}
