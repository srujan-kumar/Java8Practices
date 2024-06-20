package Java8Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Ref taken IMP *** https://stackoverflow.com/questions/4805606/how-to-sort-by-two-fields-in-java
public class MultipleWaysOfSortingForMultipleFieldsOfPOJOIMP {

    public static void main(String[] args) {
        List<Persons> listOfPersons=new ArrayList<Persons>();
        listOfPersons.add(new Persons("Rahul",30,"rahulchichha@gmail.com",Gender.MALE));
        listOfPersons.add(new Persons("Rajani",30,"rajani@gmail.com",Gender.FEMALE));
        listOfPersons.add(new Persons("Ramya",25,"ramyassn@gmail.com",Gender.FEMALE));
        listOfPersons.add(new Persons("Sanjeev",27,"Sanjeevbai@gmail.com",Gender.MALE));
        listOfPersons.add(new Persons("Suresh",34,"Suresh@gmail.com",Gender.MALE));
        listOfPersons.add(new Persons("Sabhani",17,"Subhani@gmail.com",Gender.MALE));

        // Approach1  *****
         listOfPersons.stream()
                // sort it (does not sort the original list)...
                .sorted(Comparator.comparing(Persons::getName)
                        .thenComparing(Persons::getAge))
        // and collect to a new list
    .collect(Collectors.toList()).forEach(System.out::println);

        //Approach2 --> Sorts the Original List
        // This syntax is similar to the Streams example above, but sorts the original list!!!
        listOfPersons.sort(Comparator.comparing(Persons::getName).thenComparing(Persons::getAge));
        System.out.println("List of Persons with Original List Sorting"+listOfPersons);
    }

}
