package StringProgramms;

import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.Map;

public class CharacterCountInAString {
    public static void getCharCount(String name){

        Map<Character, Integer> charMap=new HashMap<>();
        char characterArray[]=name.toCharArray();
        for(char ch:characterArray){
            //ignore any blank values in the String ****
            if(!String.valueOf(ch).isBlank()){
                if(charMap.containsKey(ch)){
                    charMap.put(ch,charMap.get(ch)+1);
                }
                else{
                    charMap.put(ch,1);
                }
            }
        }
        System.out.println(charMap);
    }

    public static void main(String[] args) {
        getCharCount("Testing Core Java Programs");
    }
}
