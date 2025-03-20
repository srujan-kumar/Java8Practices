package Java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class RemoveDuplicatesFromListOfObjectsBasedOnProperty {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(new Employee(1, "John"), new Employee(1, "Bob"), new Employee(2, "Alice"));
        employee.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Employee::getEno))), ArrayList::new))
                .stream().collect(Collectors.toList()).forEach(System.out::println);
    }
}
