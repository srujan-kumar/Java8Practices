package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// Consumer is a Predefined functional Interface in java and It has accept method
// which is used to perform some operation
public class ConsumerFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(1);
        list.add(7);
        list.add(9);
        Consumer<Integer> c=i-> System.out.println("SQUARE VALUE of "+i+" IS -->"+i*i);
        c.accept(11);
        list.stream().forEach(c);
    }
}
