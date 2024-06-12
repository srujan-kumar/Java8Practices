package StringProgramms;

public class ReverseString {
    public static void main(String[] args) {
        String str="Reverse";
        //Approach1
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }
        System.out.println("");
        // Approach2
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }

    }
}
