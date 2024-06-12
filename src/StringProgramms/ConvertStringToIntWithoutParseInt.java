package StringProgramms;

public class ConvertStringToIntWithoutParseInt {
    public static void main(String[] args) {

        System.out.println(stringToNumber("123"));
    }
    public static int stringToNumber(String str){
        int num=0;
        int len=str.length();
        for(int i=0;i<len;i++){
            // formula ***
            // iteration1 -->0+1=1,iteration2 --> 10+2=12, Iteration 3 --> 120+3=123 48 is ascii value of zero
            num=num*10+((int)str.charAt(i)-48);
        }
        return num;

    }
}
