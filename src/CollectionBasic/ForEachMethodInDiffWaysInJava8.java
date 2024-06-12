package CollectionBasic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// **** There is also forEachOrdered method see this method purpose at the END of this class comment section
public class ForEachMethodInDiffWaysInJava8 {

    public static void main(String args[]) {

        List<String> alphabets = new ArrayList<>( Arrays.asList("aa", "bbb", "cac", "dog"));
        // looping over all elements using Iterable.forEach() method
        alphabets.forEach(s -> System.out.println(s));

        // You can even replace lambda expression with method reference
        // because we are passing the lambda parameter as it is to the method
        alphabets.forEach(System.out::println);

        // you can even do something with lambda parameter e.g. adding a comma
        alphabets.forEach(s -> System.out.print(s + ","));

        // There is one more forEach() method on Stream class, which operates on stream
        // and allows you to use various stream methods e.g. filter() // map() etc
        alphabets.stream().forEach(System.out::println);

        // let's now only print elmements which startswith "a"
        alphabets.stream() .filter(s -> s.startsWith("a")) .forEach(System.out::println);

        // let's filter out only which has length greater than 2
        alphabets.stream() .filter(s -> s.length() > 2) .forEach(System.out::println);

        // now, let's print length of each string using map()
        alphabets.stream()
                .mapToInt(s -> s.length())
                .forEach(System.out::println);

        // how about calculating sum of length of all string
        alphabets.stream() .mapToInt(s -> s.length()) .sum();

        /* The map() method of Java 8 allows you to transform one type to another like in our
          first example we are using a map() to transform a list of String to a list of Integer
          where each element represents the length of String. Now, let's print the length of each string
          using the map() function: */

        alphabets.stream()
                .mapToInt(s -> s.length())
                .forEach(System.out::println);


        /* Important things to remember:
1) The forEach() is a terminal operation, which means once calling the forEach() method on stream, you cannot call another method. It will result in a runtime exception.

2) When you call forEach() on a parallel stream, the order of iteration is not guaranteed, but you can ensure that ordering by calling the forEachOrdered() method.

3) There is two forEach() method in Java 8, one defined inside Iterable, and the other inside java.util.stream.Stream class. If the purpose of forEach() is just iteration then you can directly call it like list.forEach() or set.forEach() but if you want to perform some operations like filter or map then it better first get the stream and then perform that operation and finally call forEach() method.

4) Use of forEach() results in readable and cleaner code. */

    }
}
