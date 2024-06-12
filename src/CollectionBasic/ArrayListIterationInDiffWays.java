package CollectionBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterationInDiffWays {
    public static void main(String args[]){
        List<String> alphabets=new ArrayList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");
        alphabets.add("F");


        //Using List Iterator
        Iterator<String> alphabetsIterator=alphabets.listIterator();
        while(alphabetsIterator.hasNext()){
            System.out.println("Alphabet Element is --> "+alphabetsIterator.next());
        }

        //Using Itearator
        Iterator<String> alphabetsIterator1=alphabets.iterator();
        while(alphabetsIterator1.hasNext()){
            System.out.println("Alphabet Element value is --> "+alphabetsIterator1.next());
        }

        //Using enhanced for loop
        for(String alphabet:alphabets){
            System.out.println("Alphabet Element value is --> "+alphabet);
        }

        //Using For each of java8
        alphabets.forEach(System.out::println);






    }
}
