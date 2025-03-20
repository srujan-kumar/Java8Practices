package Java8Programs;

public class ReverseANumberWIthOutusingString {
    public static void main(String[] args) {




                int num = 4562;
                System.out.println(reverseDigits(num));
            }
        static int reverseDigits(int n) {
            int revNum = 0;
            while (n > 0) {
                revNum = revNum * 10 + n % 10;
                n = n / 10;
            }
            return revNum;
        }


}
