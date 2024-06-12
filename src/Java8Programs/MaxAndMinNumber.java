package Java8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5,-1, 0,7,1,9,13,16);
        int maxnumber=numbers_list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int minnumber=numbers_list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Number -> "+maxnumber);
        System.out.println("Min Number -> "+minnumber);

    }
}
