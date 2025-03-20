package Java8Programs;

import java.util.Arrays;

public class MissingNumberFromArray {
    public static void main(String[] args) {
        int num2[]={1,3,5,2,4,7};
        Arrays.sort(num2);
        int length=num2.length;
        int expectedsum=length*(length+1)/2;
        System.out.println("Expected  Sum is -->"+expectedsum);
        int actualsum=0;
        for(int i=0;i<num2.length-1;i++){
            actualsum=actualsum+num2[i];
        }
        System.out.println("Actual  Sum is -->"+actualsum);
        int missingNumber=expectedsum-actualsum;
        System.out.println("Missing Number is -->"+missingNumber);

    }
}
