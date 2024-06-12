package corejavaprograms;

public class PrintHelloWorldWithoutMainAndStaticBlock {
    public static int printString() {
        System.out.println("Hello World");
        return 1;
    }

    static int p = printString();

    public static void main(String[] args) {

    }
}
