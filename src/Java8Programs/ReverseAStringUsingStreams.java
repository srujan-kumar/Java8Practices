package Java8Programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseAStringUsingStreams {
    public static void main(String[] args) {
        // Approach 1
        String str3="Aniruddhh";
        String revSTring=Stream.of(str3.split("")).reduce("", (reversed, character) -> character + reversed).toString();
        System.out.println("Reverse A Word-->"+revSTring);
        // Approach2
        String str = "Noorus Khan";
        int len = str.length();
        IntStream.range(0, len)
                .map(i -> len - 1 - i)
                .mapToObj(j->str.charAt(j))
                .forEach(System.out::print);

        // Approach3
        String input = "Aniruddh Kumar";
        String reverse = IntStream.range(0, input.length())
                .mapToObj(i -> String.valueOf(input.charAt(input.length() - 1 - i)))
                .collect(Collectors.joining());
        System.out.println();
        System.out.println("Reverse A Word-->"+reverse);
    }
}
