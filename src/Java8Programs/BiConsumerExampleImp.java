package Java8Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
    @FunctionalInterface
    public interface BiConsumer<T,U>{
    void accept(T t,U u);
    }

    used in map.forEach
 */
public class BiConsumerExampleImp {

    public static void main(String[] args) {
        BiConsumer<Integer,String> biconsumer=(Integer integer,String string)-> System.out.println("Key "+integer+ "Value :->"+string);
        biconsumer.accept(12,"Ram");

        // real time usage
        Map<Integer,String> mapCollection=new HashMap<>();
        mapCollection.put(13,"Raj");
        mapCollection.put(14,"Ravi");
        mapCollection.put(15,"Rangha");

        mapCollection.forEach((Integer integer,String string)->System.out.println("Key "+integer+"Value"+string));


    }

}
