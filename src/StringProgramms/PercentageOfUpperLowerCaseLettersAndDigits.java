package StringProgramms;

public class PercentageOfUpperLowerCaseLettersAndDigits {
    public static void main(String[] args) {
        String str="HelLo WoRld @ 123 &%";
        int len=str.length();
        char ch;
        int uppercaseCount=0;
        int lowercaseCount=0;
        int digitsCount=0;
        int specialcharsCount=0;
        for (int i=0;i<len;i++){
            ch= str.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercaseCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowercaseCount++;
            }
            else if(Character.isDigit(ch)){
                digitsCount++;
            }
            else{
                specialcharsCount++;
            }

        }

        double uppercasePercentage=uppercaseCount*100/len;
        double lowercasePercentage=lowercaseCount*100/len;
        double digitsPercentage=digitsCount*100/len;
        double specialcharsPercentage=specialcharsCount*100/len;

        System.out.println("For a given String -->"+str+"\n"+" uppercasePercentage is -->"+uppercasePercentage+"\n"+ " lowercasePercentage is -->"+lowercasePercentage+"\n"+ " digitsPercentage is -->"+digitsPercentage+"\n"+" specialcharsPercentage is -->"+specialcharsPercentage);


    }
}
