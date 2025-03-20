package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FetchNamesStartWithParticularLetter {
    public static void main(String[] args) {
        // List.of is from java9 ***
        List<String> namesList= List.of("Sanjay", "Rajesh", "Suresh", "Santosh", "lokesh", "Santosh");
        List<String> namesStartsWithS=new ArrayList<>();
        for(String str:namesList) {
            if(str.startsWith("S")) {  namesStartsWithS.add(str);}
        }
        System.out.println("String with the Letter starts with S --> "+namesStartsWithS);
        // Approach 2 **
        namesList.stream().filter(s->s.startsWith("S")).distinct().collect(Collectors.toList()).forEach(System.out::println);

        namesList.stream().filter(s->s.startsWith("S")).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
