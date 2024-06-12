package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith {
    public static void main(String[] args) {
        //2,222,234, 567, 890,432, 236, 211, 22  --> Identify Numbers start with 2

        List<Integer> numbers= Arrays.asList(2,222,234, 567, 890,432, 236, 211, 22);
        List<Integer> numbersStartWith2=numbers.stream().
                map(e->String.valueOf(e))
                .filter(e->e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("Numbers that starts with 2 are"+numbersStartWith2);
    }
}
