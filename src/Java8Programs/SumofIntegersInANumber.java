package Java8Programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumofIntegersInANumber {
    public static void main(String[] args) {
        int num=3456;
        //convert int to String --> String.valueOf
        //Convert String to int --> Integer::parseInt
        // Collectors.summingInt ****
        int sum=Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);

    }
}
