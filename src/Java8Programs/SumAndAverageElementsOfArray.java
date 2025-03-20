package Java8Programs;

import java.util.Arrays;

public class SumAndAverageElementsOfArray {
    public static void main(String[] args) {
        int[] num={10,12,11,4,5};
        System.out.println(Arrays.stream(num).sum());
        System.out.println(Arrays.stream(num).average().getAsDouble());

    }
}
