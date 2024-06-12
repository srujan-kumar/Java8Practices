package corejavaprograms;

/**
 *       Logic behind this Program assume you have an array with 1,2,3, 5(4 is missing)
 *
 *       identify the elements count that includes missing number (or max number) from this array i.e. 5 here
 *       **** sum of the elements (include missing number here) series formula =n(n+1)/2  --> 5(5+1)/2=15
 *       sum of the given array elements is 11(1+2+3+5)
 *       15-11=4 (this is the missing Number)
 */
public class MissingNumbersInAnIntegerArray {
    public static void main(String[] args) {
        int num[]={1,2,3,4, 5, 6, 8,9, 10};
        System.out.println("Missing Number --> "+findMissingNumber(num, 10));

    }

    public static int findMissingNumber(int num[], int totalcount){
        int expectedSum=totalcount *(totalcount+1)/2;
        int actualSum=0;
        for(int i: num){
            actualSum+=i;
        }
        return expectedSum-actualSum;
    }

}
