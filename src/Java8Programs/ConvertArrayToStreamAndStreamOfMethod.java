package Java8Programs;

import java.util.stream.Stream;
// Stream of(T t) returns a sequential Stream containing a single element.
//Stream of(T… values) is overloaded and here it returns a sequential ordered stream
// whose elements are the specified values.
//Syntax :static Stream of(T... values)
//Parameters: This method accepts a mandatory parameter values which are the elements of the new stream.
public class ConvertArrayToStreamAndStreamOfMethod {
    public static void main(String[] args) {
        String test[]={"Apple", "Banana", "Grapes"};
        Stream<String> str=Stream.of(test);
     //   System.out.println(str.count()); //  *** Count method of Stream Class
        str.forEach(System.out::println);

        // Creating a Stream having single element only
        Stream stream = Stream.of("Geeks");

        // Displaying the Stream having single element
        stream.forEach(System.out::println);
    }
}
