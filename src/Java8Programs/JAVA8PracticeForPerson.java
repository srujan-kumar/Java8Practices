package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class JAVA8PracticeForPerson {
    public static void main(String[] args) {
        List<Persons> listOfPersons=new ArrayList<Persons>();
        listOfPersons.add(new Persons("Rahul",30,"rahulchichha@gmail.com",Gender.MALE));
        listOfPersons.add(new Persons("Rajani",30,"rajani@gmail.com",Gender.FEMALE));
        listOfPersons.add(new Persons("Ramya",25,"ramyassn@gmail.com",Gender.FEMALE));
        listOfPersons.add(new Persons("Sanjeev",27,"Sanjeevbai@gmail.com",Gender.MALE));
        listOfPersons.add(new Persons("Suresh",34,"Suresh@gmail.com",Gender.MALE));
        listOfPersons.add(new Persons("Subhani",37,"Subhani@gmail.com",Gender.MALE));

        // Fetching only female persons
        listOfPersons.stream().filter(p->p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList()).forEach(System.out::println);

        // Group by Gender and Display Persons
        Map<String,List<Persons>> groupByGender=listOfPersons.stream().
                collect(Collectors.groupingBy(p->p.getGender()));
        System.out.println("Group By gender values are"+groupByGender);

        //reduce method ****
        Optional<String> names=listOfPersons.stream().map(p->p.getName()).reduce((name1, name2)->name1+", "+name2);
        if(names.isPresent()) { System.out.println(names.get());}


    }
}
