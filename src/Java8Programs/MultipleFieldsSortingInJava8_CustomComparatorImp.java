package Java8Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*    Suedo Code
        //first name comparator
Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getFirstName );

//last name comparator
Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getLastName );

//Compare by first name and then last name (multiple fields)
Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);

//Using Comparator - pseudo code
list.stream().sorted( comparator ).collect();

Note: In this program we had used existing POJO class which was used for
 */
public class MultipleFieldsSortingInJava8_CustomComparatorImp {
    public static void main(String[] args) {

        ArrayList<Employee> employees = getUnsortedEmployeeList();

        //Compare by first name and then last name
        Comparator<Employee> compareByName = Comparator
                .comparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName);

        List<Employee> sortedEmployees = employees.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

    }
    private static ArrayList<Employee> getUnsortedEmployeeList()
    {
        ArrayList<Employee> list = new ArrayList<>();
        list.add( new Employee(21, "Lokesh", "Gupta") );
        list.add( new Employee(12, "Alex", "Gussin") );
        list.add( new Employee(41, "Brian", "Sux") );
        list.add( new Employee(52, "Neon", "Piper") );
        list.add( new Employee(33, "David", "Beckham") );
        list.add( new Employee(71, "Alex", "Beckham") );
        list.add( new Employee(62, "Brian", "Suxena") );
        return list;
    }


}
