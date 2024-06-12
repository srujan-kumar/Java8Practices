package corejavaprograms;

public class SwapTwoVarsWithoutTempVar {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("A, B are -->"+a+","+b);
    }
}
