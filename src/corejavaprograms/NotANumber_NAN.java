package corejavaprograms;

public class NotANumber_NAN {
    // when you are dividing a double number with 0 or o.o it will return Infinity
    //  but not with integer as Integer will result Arthamatic Exception
    public static void main(String[] args) {
        System.out.println(2.0/0.0); // O/p -->  infinity
        System.out.println(0.0/0.0); // O/P--> NAN
        System.out.println(0.0/0);   // O/P--> NAN
        System.out.println(12.0/0);  // O/p -->  infinity
        System.out.println(9.0/0);   // O/p -->  infinity
        System.out.println(2/0.0);   // O/p -->  infinity
        System.out.println(2/0); // Results Arthamatic Exception
    }
}
