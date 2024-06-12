package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5,7,1,9,13,16);
        List<Integer> evenNumbers=numbers_list.stream()
                .filter(e->e%2==0).
                collect(Collectors.toList());

        List<Integer> oddNumbers=numbers_list.stream()
                .filter(e->e%2!=0).
                collect(Collectors.toList());

        System.out.println("Even Numbers"+evenNumbers);
        System.out.println("Odd Numbers"+oddNumbers);
    }
}
