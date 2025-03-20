package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//fetching first five numbers, skipping first 7 Numbers like this
public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5, 0,7,1,9,13,16);
        List<Integer> limitedList=numbers_list.stream().limit(5).collect(Collectors.toList());
        int sum=numbers_list.stream().limit(5).reduce((p,q)->p+q).get();
        System.out.println("limitedList --> "+limitedList);
        System.out.println("Sum of limitedList --> "+sum);
        //numbers_list.stream().limit(5).reduce((p,q)->p+q).get();
        System.out.println(numbers_list.stream().skip(numbers_list.size()-1).findFirst().get());


        //skip first five elements
        List<Integer> ListAfterSkip=numbers_list.stream().skip(5).collect(Collectors.toList());
        System.out.println("List elements after Skip --> "+ListAfterSkip);

    }
}
