package Java8Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IntegerNumbersSumFromString {
    public static void main(String[] args) {
        String test="Run1way34";
        int sum5= Integer.parseInt(Stream.of(test.split("")).filter(i-> Character.isDigit(test.charAt(Integer.parseInt(String.valueOf(i))))).collect(Collectors.reducing((x, y)->x+y)).get());
        System.out.println("SUm value is"+sum5);
        // Approach1
        String input = "abc12xx3";
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(input);
        int sum = 0;
        while(matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
    System.out.println("SUm value is"+sum);

        // Approach 2:

        String a = "jklmn489pjro635ops";

        int sum1 = 0;

        for(int i = 0; i < a.length(); i++) {
            if(Character.isDigit(a.charAt(i))) {
                sum1 = sum1 + Integer.parseInt(a.charAt(i) + "");
            }
        }

        System.out.println(sum1);


        // Approach3

        String str = "abc12xx3";

            int sum2 = 0;
            for(int i=0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i))){
                    sum2+=str.charAt(i)-'0';
                }
            }
        System.out.println("SUm value is"+sum2);


    }


}
