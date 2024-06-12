package Java8Programs;

import java.util.function.IntPredicate;

public class VowelsCountInString {
    public static void main(String[] args) {
        String str = "This is java8 automation practice";
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t=='a' || t=='e' || t=='i' || t=='o' || t=='u'||
                        t=='A' || t=='E' || t=='I' || t=='O' || t=='U';

            }
        };
        long count=str.chars().filter(vowel).count();
        System.out.println("Count of Vowels is --> "+count);
    }
}
