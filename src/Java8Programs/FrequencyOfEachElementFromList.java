package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementFromList {
    public static void main(String[] args) {
        // Count Number and Print that number count
        List<Integer> numsList= Arrays.asList(1,2,3,5,2,4,3,1,2,2,4,4,5);

        numsList.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting())).forEach((k, v)->{System.out.println(k+" --> "+v);});

        numsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((k, v)->{System.out.println(k+" --> "+v);});
        numsList.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).forEach((k, v)->{System.out.println(k+" --> "+v);});


    }
}
