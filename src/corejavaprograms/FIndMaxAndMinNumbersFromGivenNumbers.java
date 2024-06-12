package corejavaprograms;

public class FIndMaxAndMinNumbersFromGivenNumbers {
    public static void main(String[] args) {
        System.out.println("Min Number from the list is " + minNumber(12, 4, 17));
        System.out.println("Min Number from the list is " + minNumber(12, 9, 3));
        System.out.println("Max Number from the list is " + maxNumber(12, 4, 17));
        System.out.println("Max Number from the list is " + maxNumber(19, 9, 91));

    }

    public static int maxNumber(int a, int b, int c) {
        int max = 0;
        while (a > 0 || b > 0 || c > 0) {
            a--;
            b--;
            c--;
            max++;
        }
        //System.out.println(max);
        return max;
    }

    public static int minNumber(int a, int b, int c) {
        int min = 0;
        while (a > 0 && b > 0 && c > 0) {
            a--;
            b--;
            c--;
            min++;
        }
        //System.out.println(min);
        return min;
    }
}
