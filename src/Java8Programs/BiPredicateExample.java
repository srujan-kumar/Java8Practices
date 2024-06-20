package Java8Programs;

import java.util.function.BiPredicate;

/*
 biPredicate takes 2 parameters
 */
public class BiPredicateExample {
    public static void main(String[] args)
    {
        // Simple predicate for checking equality
        BiPredicate<Integer, String> biPredicate = (n, s) ->
        {
            if (n == Integer.parseInt(s))
                return true;
            return false;
        };

        System.out.println(biPredicate.test(2, "2"));

        // Predicate for checking greater than
        BiPredicate<Integer, String> biPredicate1 = (n, s) ->
        {
            if (n > Integer.parseInt(s))
                return true;
            return false;
        };

        // ANDing the two predicates
        BiPredicate<Integer, String> biPredicate2
                = biPredicate.and(biPredicate1);
        System.out.println(biPredicate2.test(2, "3"));

        // ORing the two predicates
        biPredicate2 = biPredicate.or(biPredicate1);
        System.out.println(biPredicate2.test(3, "2"));

        // Negating the predicate
        biPredicate2 = biPredicate.negate();
        System.out.println(biPredicate2.test(3, "2"));

        // ledum 30 --> 3 weeks
    }
}
