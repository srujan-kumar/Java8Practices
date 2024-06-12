package Java8Programs;
/*  Sequential Streams are non-parallel streams that use a single thread to process the pipelining.
  Any stream operation without explicitly specified as parallel is treated as a sequential stream.
 */

/* Parallel stream leverage multi-core processors, which increases its performance.
Using parallel streams, our code gets divide into multiple streams which can be executed parallelly on
separate cores of the system and the final result is shown as the combination of all the individual core’s
outcomes. It is always not necessary that the whole program be parallelized, but at least some parts should be
 parallelized which handles the stream. The order of execution is not under our control and can give us
 unpredictably unordered results and like any other parallel programming.

 One of the simple ways to obtain a parallel stream is by invoking the "parallelStream()" method of Collection interface.
Another way is to invoke the "parallel()" method of BaseStream interface on a sequential stream.

 */

import java.util.Arrays;
import java.util.List;

public class ParallelStreamAndStreamJava8 {
    public static void main(String[] args) {
        // create a list
        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // using parallelStream()
        // method for parallel stream
        list.parallelStream().forEach(System.out::print);
        // O/p for this line we got is "ES!KGEHello". this may change each for each execution.
        // but this parallel stream boosts the performance so the situation where the order is not important is the best technique to use.
        System.out.println("");
        System.out.println("-------------------");
        // *** If we want to make each element in the parallel stream to be ordered, use "forEachOrdered()" method, instead of the forEach() method.
        list.parallelStream().forEachOrdered(System.out::print);



    }
}
