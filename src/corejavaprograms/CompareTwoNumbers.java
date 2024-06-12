package corejavaprograms;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        // **** Integer range -128 to 127. Until this range Integer caching (Due to Auto Boxing)  is happening.
        // i.e.. reference will take actual value instead of hashcode
        //O/p for this program is Equal and Not equal
        Integer num1=100;
        Integer num2=100;
        Integer num3=190;
        Integer num4=190;

        if(num1==num2){
            System.out.println("equal");
        }
        if(num3==num4){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
