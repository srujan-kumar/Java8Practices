package CollectionBasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationInDiffWays {
    public static void main(String[] args) {
        Set<String> subjects=new HashSet<>();
        subjects.add("Hindi");
        subjects.add("English");
        subjects.add("Telugu");
        subjects.add("Science");
        subjects.add("Social");
        subjects.add("Maths");
        subjects.add("Urdhu");

        //Using Iterator ****
        Iterator<String> subjIterator =subjects.iterator();
        while(subjIterator.hasNext()){
            System.out.println("Subject Name is -->"+subjIterator.next());
        }


        // enhanced for loop
        for (String subject: subjects) {
            System.out.println("Subject Name using Enhanced for loop is -->"+subject);
        }

        //forEach JAVA8 ****
        subjects.forEach(System.out::println);




    }
}