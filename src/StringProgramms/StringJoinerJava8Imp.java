package StringProgramms;

import java.util.StringJoiner;

// Combine three Strings --> [Tom, Lisa, Naveen]
public class StringJoinerJava8Imp {
    public static void main(String[] args) {
        StringJoiner joiner=new StringJoiner(",","[", "]"); // parameter types are delimeter, prefix, suffix
        joiner.add("Tom").add("Lisa").add("naveen");
        System.out.println(joiner.toString());
    }
}
