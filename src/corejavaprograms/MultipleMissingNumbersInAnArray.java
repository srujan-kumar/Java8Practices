package corejavaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * Logic followed for the below Program
 *     1. Adds all numbers from the minimum number of the array to the maximum number of the array to the set.
 *     2. Iterates through the array and removes every item of the array from the set.
 *     3. Prints the remaining items in the set, which are all the missing items of the array.

 */
public class MultipleMissingNumbersInAnArray {
    public static void main(String[] args) {

        // Approach 1
        int[] numbers = {9, 6, 4, 5, 7, 0, 1};
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();

        for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
            set.add(i);
        }

        for (int i = 0; i < numbers.length; i++) {
            set.remove(numbers[i]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }

         //Approach 2
        int i = 0;
        int a[] = { 6, 7, 8, 9, 11, 12, 13, 16, 17, 18 };
        int diff = a[0] - 0;
        for (i = 0; i < a.length; i++) {
            if(a[i]-i != diff)
            {
                while(diff<a[i]-i)
                {
                    System.out.println(i + diff);
                    diff++;
                }
            }
        }
    }
}
