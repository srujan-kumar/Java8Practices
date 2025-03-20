package Java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CommonElementsBetweenArrays {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5,7,2};
        int array2[] = {4, 5, 6, 7, 8, 1};
        fetchCommonElements(array1, array2);

    }

    public static void fetchCommonElements(int arr1[], int arr2[]) {
        // Approach 1 *****
        List<Integer> commonElements = Arrays.stream(arr1).
                filter(number -> Arrays.stream(arr2).
                        anyMatch(array2Number -> array2Number == number)).boxed().
                collect(Collectors.toList());
        System.out.println("Common Elements" + commonElements);

        // Approach2  --> retainAll() of Set ***
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:arr1) set1.add(i);
        for(int i:arr2) set2.add(i);
        set1.retainAll(set2);

        System.out.println("Common elements using hashset Approach is"+set1);

        // Approach 3 very Imp **
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        // Understand the usage of method Reference ****
        list1.stream().filter(list2::contains).forEach(System.out::println); // O/P --> 21, 34, 56

        // Very Imp *** iterate two lists and get new filtered list which will have un common values not present in second list.
        list1.stream().filter(e->!list2.contains(e)).forEach(System.out::println); // O/P: 71, 89, 28
        list2.stream().filter(e->!list1.contains(e)).forEach(System.out::println); // O/P: 12, 17, 94
    }
}
