package Java8Programs;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MaxAndMinNumbersFromAnArrayImp_IntSummaryStatistics {
    public static void main(String[] args) {
        int numbers[]={4,5,6,9,2,3,11};
        IntStream.of(numbers).min().ifPresent(System.out::println);
        IntStream.of(numbers).max().ifPresent(System.out::println);
        IntStream.of(numbers).average().ifPresent(System.out::println);
        IntStream.of(numbers).count();
        IntStream.of(numbers).sum();

        // Approach 2
        IntSummaryStatistics statistics=IntStream.of(numbers).summaryStatistics();
        statistics.getMax();
        statistics.getMin();
        statistics.getAverage();
        statistics.getCount();
        statistics.getSum();





    }
}
