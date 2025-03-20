package corejavaprograms;

public class ReverseAlphabetsOnlyFromStringImp {
    public static void main(String[] args) {


                String input = "34test90trel9gda@sdet!23pro";
                StringBuffer output = new StringBuffer();
                StringBuffer temp = new StringBuffer();
                int index = 0;

                char[] allChars = input.toCharArray();

                while(index<allChars.length){
                    if(!Character.isLetter(allChars[index])){
                        output.append(allChars[index]);
                    }else{
                        while(index<allChars.length && Character.isLetter(allChars[index])){
                            temp.append(allChars[index]);
                            index++;
                        }
                        index--;
                        output.append(temp.reverse().toString());
                        temp.delete(0, temp.length());
                    }
                    index++;

                }

                System.out.println(output.toString());

            }
        }

