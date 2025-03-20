package Java8Programs;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int num[]={1,3,4,6,5,8,9};

        // Approach 1 without Java8
        int total=0;
        for(int e:num){
            total=total+e;
        }
        System.out.println("Avg is -->"+total/num.length);

        // Approach2 JAVA8 ***
        Double avg=Arrays.stream(num).average().getAsDouble();
        System.out.println("Avg of array elements"+avg);


    }
}
