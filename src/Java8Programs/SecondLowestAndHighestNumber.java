package Java8Programs;

import java.util.*;

public class SecondLowestAndHighestNumber {
    // understand the power of distinct, skip, findfirst methods usage
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5,7,1,9,13,16);
        int secondHighestNum=numbers_list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        int secondLowestNum=numbers_list.stream().sorted().distinct().skip(1).findFirst().get();

        System.out.println("secondHighestNum is  "+secondHighestNum);
        System.out.println("secondLowestNum is  "+secondLowestNum);

        Optional<Integer> thirdNum=numbers_list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();



    }
}
