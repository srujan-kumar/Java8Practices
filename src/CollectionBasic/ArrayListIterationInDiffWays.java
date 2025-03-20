package CollectionBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterationInDiffWays {
    public static void main(String args[]){
        List<String> alphabets=new ArrayList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("E");
        alphabets.add("F");

        List<String> listTemp = new ArrayList<>();

        listTemp.add("A");
        listTemp.add("D");
        listTemp.add("E");


        boolean b = alphabets.containsAll(listTemp);
        System.out.println("Collections Check-->"+b);

        //Using List Iterator
        ListIterator<String> alphabetsIterator=alphabets.listIterator();

        alphabetsIterator.add("G");

        ArrayList <String> name = new ArrayList<>();
        name.add("Ravi");
        name.add("Tina");
        name.add("Payal");
        name.add("Aashi");
        ListIterator<String> iterator = name.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.set("None");
        System.out.println("After using the set() method : ");
        for (String item : name) {
            System.out.println(item);
        }

        while(alphabetsIterator.hasNext()){
            System.out.println("Alphabet Element List Iterator Iteration  is --> "+alphabetsIterator.next());
        }

        alphabetsIterator.set("H");
        for(String str: alphabets){
            System.out.println(str);

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
