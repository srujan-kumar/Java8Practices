package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SquareOfANumber {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,5,7,9,11,15,6);
        double average=numbers_list.stream()
                        .map(e->e*e)
                                .filter(e->e>100)
                                        .mapToInt(e->e)
                                                .average()
                                                        .getAsDouble();


        System.out.println("Capture the Numbers Whose Square is greater than 100 print average of those Numbers Square "+average);
    }
}
