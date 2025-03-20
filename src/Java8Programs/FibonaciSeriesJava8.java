package Java8Programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonaciSeriesJava8 {
   // static int prev = 0;
    public static void main(String[] args)
    {

        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})

                .map(f -> f[0])
                .limit(10)
                .forEach(i -> System.out.print(i+" "));

        //Stream.iterate(new int[]{0,1}, f->new int []{f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(i->System.out.print(i+" "));

//        IntStream.iterate(1, n -> {
//            n = n + prev;
//            prev = n - prev;
//            return n;
//        }).limit(10).forEach(System.out::println);
    }
}
