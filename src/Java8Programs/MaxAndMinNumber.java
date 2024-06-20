package Java8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers_list= Arrays.asList(2,3,4,5,-1, 0,7,1,9,13,16);
        int maxnumber=numbers_list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int minnumber=numbers_list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max Number -> "+maxnumber);
        System.out.println("Min Number -> "+minnumber);

        // Approach2
        int maxnumber1=numbers_list.stream().max((i1,i2)->i1.compareTo(i2)).get();
        int minnumber1=numbers_list.stream().min((i1,i2)->i1.compareTo(i2)).get();

        System.out.println("Max Number using Approach2  -> "+maxnumber1);
        System.out.println("Min Number using Approach2  -> "+minnumber1);

        // ****** Diff b/n Collection.toArray() vs Collection.stream().toArray()
        // Arrays.asList() creates a fixed-size List. Its implementation of toArray() is a simple System.arraycopy(). Very fast
        // On the other hand, when you do myList.stream().toArray(String[]::new), the size is not known, so the
        // Stream.toArray() method has to consume the stream, collect all the values, then create the array and copy the
        // values into the array. That is a lot slower, and requires a lot more memory.
        Integer[] numlist=numbers_list.toArray(new Integer[numbers_list.size()]);
        Integer[] numlist1=numbers_list.stream().toArray(Integer[]::new);



    }
}
