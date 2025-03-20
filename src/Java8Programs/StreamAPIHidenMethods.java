package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.*;

// Ref from https://www.youtube.com/watch?v=xHCWU9Q88rQ
public class StreamAPIHidenMethods {
    public static void main(String[] args) {
        // Stream.ofNullable
        // Stream.iterate()
        // Collectors.collectingAndThen()
        // stream.takeWhile and stream.dropWhile
        //Collectors.teeing()
        //Stream.concat()
        //Collectors.partioningBy
        //IntStream for Ranges

        // 1) Stream.ofNullable

        List<String> names= Arrays.asList("Sanjay", "Suresh", null, "Subhani", "Sandeep", null);
        List<String> names1=names.stream().filter(name->name!=null).collect(toList());
        List<Stream<String>> collect = names.stream().map(Stream::ofNullable).collect(toList());
           // from the above line, the simplest way to get List from the stream is using flatMap
        List<String> collect1 = names.stream().flatMap(Stream::ofNullable).collect(toList());
        System.out.println(names1);
        System.out.println(collect1);

        //2)  Stream.iterate
        Stream.iterate(1, n->n+2).limit(5).forEach(System.out::println);

        // 3) Collectors.CollectingAndThen -->
        List<Employee> employeeList=Arrays.asList(new Employee(1,"Sanjay", 75000),
                new Employee(2,"Suri", 75000),
                new Employee(3,"Ramaa", 75000));
            // we are calculating average sal and Then round to nearest Integer
        Long empSalAvgresult=employeeList.stream().mapToLong(Employee::getEsal)
                .boxed() // this will return a stream
                .collect(collectingAndThen(averagingLong(Long::longValue),
                        Math::round));
        System.out.println("Sal Avg is"+empSalAvgresult);

        Double empSalAvgresult1=employeeList.stream().mapToLong(Employee::getEsal)
                .boxed() // this will return a stream
                .collect(averagingLong(Long::longValue));
        System.out.println("Sal Avg is"+empSalAvgresult1);

        // Stream.takeWhile & dropWhile --> from Stream what do you want to take and what do you want to drop
        List<Integer> numList=List.of(1,2,3,4,5,6,7,8);


        numList.stream().takeWhile(num->num<5).forEach(System.out::println);
        numList.stream().dropWhile(num->num>5).forEach(System.out::println);
        System.out.println("------------------");

        numList.stream().takeWhile(num->num<4).dropWhile(num->num>5).forEach(System.out::println);

        // Collectors.teeing() -> it is from java 12 and it allow you to perform two collectors in parallel and then combine their result
        // using a a specific function
        // **** we are trying to collect min, max and store that into MAP
//        Map<String,Integer> minMaxMap;
//        minMaxMap = numList.stream().collect(Collectors.
//                teeing(Collectors.maxBy(Integer::compareTo),
//                Collectors.minBy(Integer::compareTo),
//                (e1,e2) -> Map.of("Max",e1.get(), "Min",e2.get())));

        // we commented above due to we are using java8 for now

        // Stream.concat ***
        Stream<Integer> stream1=Stream.of(1,2,3);
        Stream<String> stream2=Stream.of("HI", "Hello");
        Stream<Integer> stream3=Stream.of(4,5,6);
        Stream<Object> concatStream=Stream.concat(stream1,stream2);
        concatStream.collect(toList()).forEach(System.out::println);
//
//        Stream<Integer> concatStream1=Stream.concat(stream1,stream3);
//        long sum=concatStream1.mapToInt(Integer::intValue).sum();
//        System.out.println("SUM is -->"+sum);

        // ***** collectors.partitioningBy --> if you want to partition the stream into two different groups
        Map<Boolean, List<Integer>> numbersPartitioning=numList.stream().collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println("Even and Odd Numbers Partitioning -->"+numbersPartitioning);
        System.out.println("ODD NUmbers "+numbersPartitioning.get(Boolean.FALSE));
        System.out.println("EVEN NUmbers "+numbersPartitioning.get(Boolean.TRUE));

        // Int Stream for Ranges
        List<Integer> intStream1=IntStream.range(1,20).boxed().collect(Collectors.toList());
        System.out.println("Int Stream Output"+intStream1);


    }
}
