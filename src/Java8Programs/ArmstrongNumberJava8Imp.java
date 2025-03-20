package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Ref:
public class ArmstrongNumberJava8Imp {

    public static void main(String[] args) {

        System.out.println(isArmStrong(153));
        System.out.println(isArmStrong(371));
        System.out.println(isArmStrong(246));
        System.out.println(armStrongListUpto(1000));
    }
    static boolean isArmStrong(int num) {
        return num==armStrongViaStream(num);
    }

    //via Stream
    static int armStrongViaStream(int num) {
        int size = String.valueOf(num).length();
        return IntStream.iterate(num, i->i/10)
                .limit(size)
                .map(i-> (int)Math.pow(i%10, size))
                .sum();
    }

    //List via Stream
    static List<Integer> armStrongListUpto(int num){
        List<Integer> list=new ArrayList<>();
        list=IntStream.rangeClosed(0, num)
                .filter(i->isArmStrong(i)).boxed()
                .collect(Collectors.toList());
        return list;
    }
}
