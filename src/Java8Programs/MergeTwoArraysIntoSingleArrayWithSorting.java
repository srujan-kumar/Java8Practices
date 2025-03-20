package Java8Programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysIntoSingleArrayWithSorting {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7};
        int num1[]={1,8,9,3,10,6,11};
        IntStream.concat(Arrays.stream(num),Arrays.stream(num1)).sorted().forEach(System.out::print);
        IntStream.concat(Arrays.stream(num),Arrays.stream(num1)).sorted().distinct().forEach(System.out::print);
    }
}
