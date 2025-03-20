package Java8Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAString {
    public static void main(String[] args) {
        String input="Hello World How Are You";
        String reversed=Arrays.stream(input.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println("Reversed String"+reversed);
    }
}
