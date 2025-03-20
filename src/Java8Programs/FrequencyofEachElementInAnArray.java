package Java8Programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/** boxed method **** --> boxed method converts primitives in a streams of primitive types (IntStream, LongStream, DoubleStream)
 to their corresponding wrapper classes (Integer, Long, Double), enabling seamless integration with the Collections
 framework. This is essential for collecting stream elements into collections like List, Set, or Map, which do not support primitive types. */

public class FrequencyofEachElementInAnArray {
    public static void main(String[] args) {
        int num[]={1,5,6,7,1,4,6,2,3,2};
        Map<Integer,Long> occurrences =
                Arrays.stream(num)
                        .boxed()
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(occurrences);

        // **** in much better way you can replace s->s with Function.identity()
        Map<Integer,Long> occurrences1 =
                Arrays.stream(num)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrences1);
    }
}
