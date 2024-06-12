package Java8Programs;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class PracticeClassForSyntax2 {
    public static void main(String[] args) {
        List<Persons> personsList=new ArrayList<>();
        personsList.add(new Persons("Raju", 25, "rajubhai@rediff.com", Gender.MALE) );
        personsList.add(new Persons("Santosh", 28, "Santoshbai@gmail.com", Gender.MALE) );
        personsList.add(new Persons("Madhuri", 24, "madhuriraj@gmail.com", Gender.FEMALE) );
        personsList.add(new Persons("kalpana Chawla", 30, "kalapana@gmail.com", Gender.FEMALE) );
        personsList.add(new Persons("Hareesh", 33, "Harishhai@gmail.com", Gender.MALE) );
        personsList.add(new Persons("kalpana Chawla", 30, "kalapana@gmail.com", Gender.FEMALE) );

        boolean gmailVerf=personsList.stream().allMatch(p->p.getEmail().endsWith("gmail.com"));
        boolean femaleExistVerf=personsList.stream().anyMatch(p->p.getGender().equals(Gender.FEMALE));
        boolean yahooMailVerf=personsList.stream().noneMatch(p->p.getEmail().endsWith("yahoo.com"));
        System.out.println("Gmail Verf"+gmailVerf);
        System.out.println("female Exist Verf "+femaleExistVerf);
        System.out.println("yahoo Mail Verf "+yahooMailVerf);

        System.out.println("Find First Gmail Person--> "+personsList.stream().filter(p->p.getEmail().endsWith("gmail.com")).findFirst().get());
        // Very Imp Removing Duplicate Objects from the List in Java8 ******
        List<Persons> disticntList = personsList.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparing(Persons::getName))),
                        ArrayList::new));
        System.out.println("Distinct Persons List--> "+disticntList);

        Map<String,List<Persons>> genderBasedGroup=personsList.stream().collect(Collectors.groupingBy(p->p.getGender()));
        System.out.println("GenderBased Grouping List is "+genderBasedGroup);
        Set<String> personsName=personsList.stream().map(p->p.getName()).collect(toCollection(TreeSet::new));
        for(String name:personsName){
            System.out.println("Persons names Are --> "+name);
        }

        //get Min age Persons details

        System.out.println("Min Age Person Details are -->"+personsList.stream().min((p1,p2)->p1.getAge()-p2.getAge()).get());

        System.out.println("Max Age Person Details are -->"+personsList.stream().max((p1,p2)->p1.getAge()-p2.getAge()).get());

        // Converting list to map java8 ***
        Map<String, String> perosnsMap=disticntList.stream().collect(Collectors.toMap(Persons::getName,Persons::getEmail));
        System.out.println("Perosn Map Details are--> "+perosnsMap);

        //MultiMap *** --> Create a Map based on Gender
        Map<String,List<String>>genderbasedMap=disticntList.stream().collect
                (Collectors.groupingBy(Persons::getGender,Collectors.mapping(Persons::getName,
                        Collectors.toList())));
        System.out.println("Gender Based map details are"+genderbasedMap);

        List<Integer> list=Arrays.asList(1,3,5,7,9,2,6);
        int sum=list.stream().reduce((x,y)->x+y).get();
        System.out.println("Sum of Integers list is -->"+sum);

        int numbers1[]={1,3,5,7,9,2,6};
        int sum1=Arrays.stream(numbers1).reduce((x,y)->(x+y)).getAsInt();
        System.out.println("Sum of Integers list is -->"+sum1);
        double avg=Arrays.stream(numbers1).reduce((x,y)->(x+y/numbers1.length)).getAsInt();
        System.out.println("Average of Integers list is -->"+avg);




    }
}
