package Java8Programs;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleJava8 {
    public static void main(String[] args) {
        Consumer<Integer> consumer=(Integer integer)-> System.out.println("Value ::"+integer);
        consumer.accept(25);

        List<Integer> numbersList=List.of(12, 15, 27, 24, 35);
        numbersList.forEach(consumer);

    }
}
