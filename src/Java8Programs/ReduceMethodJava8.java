package Java8Programs;

import java.util.Arrays;

public class ReduceMethodJava8 {
    public static void main(String[] args) {
        int numbers[]={23,45,67,8,34,96};
        int sum1=Arrays.stream(numbers).reduce(0,(x,y)->(x+y));
        System.out.println("SUM OF ARRAY NUMBERS -->"+sum1);


    }
}
