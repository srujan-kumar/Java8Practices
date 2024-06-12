package Java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsBetweenArrays {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
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
    }
}
