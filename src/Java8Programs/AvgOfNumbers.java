package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(1,6,7,9,3,5, 4);
        double average=numbers_list.stream().mapToInt(e->e).average().getAsDouble();

        System.out.println("Average of the given Numbers are"+average);
    }
}
