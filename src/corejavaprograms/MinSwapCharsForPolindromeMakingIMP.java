package corejavaprograms;
/* Ref from https://www.geeksforgeeks.org/count-minimum-swap-to-make-string-palindrome/

Time Complexity: O(n2)
Auxiliary Space: O(1)

Approach: Check whether it is possible to make a palindrome or not from the given string. As we know that if more than one character in a string occurs an odd number of times that string can’t be a palindrome.
If palindrome is not possible then return -1.
Take two pointers left pointing to the 0th index and a right pointer pointing to the last index to the given string
Do the following until left pointer is less than right pointer:
Fix the left pointer and move a copy of right pointer say r, to right side to search element which is similar to character pointing by left pointer.
If the left pointer is equal to r pointer, it means this is an odd occurring character that we have to move at the middle of the string.
 So swap character at r index to its next index (move character toward right side)
Increment result by 1 for this swap operation.
Otherwise,
Swap the found character at r to right side, until it reaches at right index and keeps incrementing the result for the swap operation.
Increment left by 1 and decrement right by 1.

Example: Input: aabcb
Output: 3
Explanation:
After 1st swap: abacb
After 2nd swap: abcab
After 3rd swap: abcba

Input: adbcdbad
Output: -1
 */


import java.util.HashMap;
import java.util.Map;

public class MinSwapCharsForPolindromeMakingIMP {
    public static void main(String[] args) {
        String s = "aabcc";
        System.out.print(minSwap(s));
    }

    public static int minSwap(String s)
    {
        HashMap<Character, Integer> unmp = new HashMap<Character, Integer>();
        int odd = 0;
        int left = 0;
        int right = s.length() - 1;
        int result = 0;

        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (unmp.containsKey(c))
                unmp.put(c, unmp.get(c) + 1);
            else
                unmp.put(c, 1);
        }

        for (Map.Entry i : unmp.entrySet())
        {
            int val = unmp.get(i.getKey());
            if(val % 2 == 1)
            {
                odd++;
            }
        }

        if (odd > 1)
        {
            return -1;
        }

        while (left < right)
        {
            int l = left;
            int r = right;
            while (s.charAt(l) != s.charAt(r))
            {
                r--;
            }
            if (l == r)
            {

                // when we found odd element
                char ch1 = s.charAt(r), ch2 = s.charAt(r+1);
                s = s.substring(0, r) + ch2
                        + ch1 + s.substring(r + 2);
                result++;
                continue;
            }
            else
            {
                // Normal element
                while (r < right)
                {
                    char ch1 = s.charAt(r), ch2 = s.charAt(r+1);
                    s = s.substring(0, r) + ch2
                            + ch1 + s.substring(r + 2);
                    result++;
                    r++;
                }
            }
            left++; right--;
        }
        return result;
    }
}

