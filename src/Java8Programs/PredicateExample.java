package Java8Programs;
// Predicate is a functional interface in java, it has a "test" method which can be implemented
// in subclasses to check some boolean condition operations

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(5));
        System.out.println(p.test(4));
    }
}
