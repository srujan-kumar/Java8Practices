package corejavaprograms;



public class PassNullArgumentWithMethodOverLoadOfStringAndObjectTypes {

    //O/P for this program Compiler will call test method which is with String argument
    public static void main(String[] args) {

        test(null);
    }
    public static void test(Object o){
        System.out.println("Object Class");
    }
    public static void test(String o){
        System.out.println("String Class");
    }
}
