package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FetchNamesStartWithParticularLetter {
    public static void main(String[] args) {
        // List.of is from java9 ***
        List<String> namesList= List.of("Sanjay", "Rajesh", "Suresh", "Santosh", "lokesh");
        List<String> namesStartsWithS=new ArrayList<>();
        for(String str:namesList) {
            if(str.startsWith("S")) {  namesStartsWithS.add(str);}
        }
        System.out.println("String with the Letter starts with S --> "+namesStartsWithS);

        namesList.stream().filter(s->s.startsWith("S")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
