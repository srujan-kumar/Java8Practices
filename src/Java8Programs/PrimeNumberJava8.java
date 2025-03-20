package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberJava8 {
    public static void main(String[] args) {
        System.out.println(primeNumbersListUpTo(100));
    }
    public static boolean isPrimeCheck(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }
    public static List<Integer> primeNumbersListUpTo(int num){
        List<Integer> list=new ArrayList<>();
        list=IntStream.rangeClosed(2, num)
                .filter(i->isPrimeCheck(i)).boxed()
                .collect(Collectors.toList());
        return list;
    }
}
