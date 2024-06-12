package Java8Programs;

import java.util.*;
import java.util.stream.Collectors;

interface Car{
            public abstract void engineCapacity(String engHP);
        }


public class PracticeClassForSyntaxes  {
    public static void main(String[] args) {
        Car c=engHP->System.out.println("CAR Horse Power is -->"+engHP);
        c.engineCapacity("1000HP");
        TreeSet<Integer> numlist3=new TreeSet<>((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0);
        numlist3.add(3);
        numlist3.add(5);
        numlist3.add(2);
        numlist3.add(4);
        numlist3.add(7);
        numlist3.add(1);
        System.out.println("Tree set default sorting list is"+numlist3);

        TreeMap<Integer,String> emplist=new TreeMap<>((e1,e2)->(e1>e2)?1:(e1<e2)?-1:0);
        emplist.put(3,"Santosh");
        emplist.put(1,"Ram");
        emplist.put(5,"ROHIT");
        emplist.put(4,"Karan");
        emplist.put(2,"Suresh");

        List<Employee> emplist1=new ArrayList<Employee>();
        emplist1.add(new Employee(10, "Kanna", 55000, "IT"));
        emplist1.add(new Employee(7, "Ravi", 50000, "HR"));
        emplist1.add(new Employee(5, "Tarun", 60000, "ACCOUNTS"));
        emplist1.add(new Employee(15, "Suresh", 90000, "MANAGEMENT"));
        Collections.sort(emplist1,(e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0);

        System.out.println("Sorted Emp list based on Emploee Num is"+emplist1);

        Collections.sort(emplist1,(e1,e2)->(e1.esal>e2.esal)?1:(e1.esal<e2.esal)?-1:0);

        System.out.println("Sorted Emp list based on Emploee Sal is"+emplist1);

        emplist1.sort(Comparator.comparing(Employee::getEname));
        System.out.println("Sorted Emp list based on Emploee NAME is"+emplist1);

        emplist1.stream().sorted(Comparator.comparing(Employee::getEsal));

        List<Integer> duplicateList=new ArrayList<>();
        duplicateList.add(5);
        duplicateList.add(2);
        duplicateList.add(7);
        duplicateList.add(3);
        duplicateList.add(5);
        List<Integer> duplicateList1=duplicateList.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Duplicate elements remove and sort"+duplicateList1);






        System.out.println("Tree MAP After sorting is"+emplist);





        List<Integer> numList= Arrays.asList(1,5,6,7,9,3,12,2,8);
        numList.sort(Comparator.naturalOrder());
        System.out.println("sorted numbers");
        System.out.println("sorted numbers"+numList);

        List<Integer> numList1= Arrays.asList(1,5,6,7,9,3,12,2,8);
        Collections.sort(numList1,(i1, i2)->(i1>i2)?1:(i1<i2)?-1:0);
        System.out.println("sorted numbers using Collections.sort is"+numList);

        List<String> stringList=Arrays.asList("Hi", "Hello", "Ram", "King", "Avinash","kirak","abhi");

        stringList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("sorted String with Case insentitive is"+stringList);

        List<String> stringList1=Arrays.asList("Hi", "Hello", "Ram", "King", "Avinash","kirak","abhi");

        stringList1.sort(Comparator.naturalOrder());
        System.out.println("sorted String with Natural Order is"+stringList1);



        Thread t=new Thread(()-> {
            System.out.println("Thread start");
            for (int i = 0; i <10; i++){ System.out.println("Value " + i);}
        });
        t.start();


    }
}
