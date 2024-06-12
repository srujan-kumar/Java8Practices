package Java8Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {
    public static void main(String[] args) {
        String batsmen[]={"Rohit", "Virat", "Rinku", "Gill"};
        String bowlers[]={"Bhuvi", "Bumrah", "Srinath", "Prasad"};

        Stream<String> bat=Arrays.stream(batsmen);
        Stream<String> bowl=Arrays.stream(bowlers);

        String fullTeam[]=Stream.concat(bat,bowl).toArray(size-> new String[size]);
        for(String player:fullTeam){
            System.out.println(player);
        }
    }
}
