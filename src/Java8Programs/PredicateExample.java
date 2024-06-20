package Java8Programs;
// Predicate is a functional interface in java, it has a "test" method which can be implemented
// in subclasses to check some boolean condition operations

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(5));
        System.out.println(p.test(4));

        List<Integer> list=List.of(100,200,300, 400, 500, 600, 700, 800, 900);

        Predicate<Integer> p1=i->i>100;
        Predicate<Integer> p2=i->i<500;
        // observe the and usage in filter
        list.stream().filter(p1.and(p2).negate()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------");
        list.stream().filter(p1.and(p2)).collect(Collectors.toList()).forEach(System.out::println);


    }
}
