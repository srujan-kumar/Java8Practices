package StringProgramms;

public class Print1to100WithoutUsingNumbers {
    public static void main(String[] args) {
        int one='A'/'A'; // returns 1;
        // Approach1

        String s1="..........";
        for (int i=one;i<=s1.length()*s1.length();i++){
            System.out.println(i);
        }
        // Approach 2 --> based on Ascii value a=97, b=98, c=99, d=100
        for (int i=one;i<='d';i++){
            System.out.println(i);
        }


    }
}
