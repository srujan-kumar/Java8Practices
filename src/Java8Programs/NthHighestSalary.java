package Java8Programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {
        Map<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Tom", 1000);
        priceMap.put("Sanjay", 1200);
        priceMap.put("Rahul", 1100);
        priceMap.put("Somu", 1400);
        priceMap.put("Tester", 1700);
        priceMap.put("Ram", 1600);
        priceMap.put("Ramana", 1300);
        // in this example we are trying to fetch 2nd highest price.
        // Since index starts from 0, we passed 1 for nthHighestSal method
        System.out.println(getNthHighestSalary(1,priceMap));

    }
    // understand
    public static Map.Entry<String,Integer> getNthHighestSalary(int num, Map<String, Integer> priceMap) {
        return priceMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())   // ** Collect the sorted entries into a List
                .get(num);

    }
}
