package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;

//Where ever you have list of objects and in each object if you found another list of subobjects,
// and if you want to perform any operations on subobjects, then go for FlatMap **
public class FlatMapRealtimeExamples {
    public static void main(String[] args) {
        Employee emp1=new Employee(12, "Raj", 25000);
        Employee emp2=new Employee(1, "Rocky", 50000);
        Employee emp3=new Employee(11, "Jaya", 44000);
        Employee emp4=new Employee(16, "Raj", 75000);
        Employee emp5=new Employee(2, "Raj", 54000);
        Employee emp6=new Employee(22, "Raj", 89000);
        Employee emp7=new Employee(34, "Raj", 25000);
        Employee emp8=new Employee(46, "Raj", 95000);
        Employee emp9=new Employee(57, "Raj", 25000);
        Employee emp10=new Employee(76, "Raj", 125000);
        Employee emp11=new Employee(87, "Raj", 65000);
        Employee emp12=new Employee(94, "Raj", 35000);
        Employee emp13=new Employee(101, "Raj", 25000);

        List<Employee> StaffEMPList=new ArrayList<>();
        StaffEMPList.add(emp1);
        StaffEMPList.add(emp4);
        StaffEMPList.add(emp7);

        List<Employee> ITEMPList=new ArrayList<>();
        ITEMPList.add(emp2);
        ITEMPList.add(emp3);
        ITEMPList.add(emp9);

        List<Employee> HREMPList=new ArrayList<>();
        HREMPList.add(emp5);
        HREMPList.add(emp6);
        HREMPList.add(emp8);
        HREMPList.add(emp12);

        List<Employee> MgmtEMPList=new ArrayList<>();
        MgmtEMPList.add(emp11);
        MgmtEMPList.add(emp10);
        MgmtEMPList.add(emp13);

       List<Department> deptList=new ArrayList<>() ;
        deptList.add(new Department(116,"STAFFDEPT", StaffEMPList));
        deptList.add(new Department(106,"ITDEPT", ITEMPList));
        deptList.add(new Department(101,"HRDEPT", HREMPList));
        deptList.add(new Department(116,"MgmtDEPT", MgmtEMPList));

        OptionalLong maxSalOfSpecDept=deptList.stream().filter(department -> department.getDeptNo()==106).
                flatMap(dept ->dept.employeeList.stream()).mapToLong(emp->emp.esal).max();

        System.out.println("Max Salary of a specific Dept is "+maxSalOfSpecDept);

        // Fetch max Salary among all Departments is

        OptionalLong maxSalFromAllDept=deptList.stream().
                flatMap(dept ->dept.employeeList.stream()).mapToLong(emp->emp.esal).max();

        System.out.println("Max Salary From ALL Dept is "+maxSalFromAllDept);











    }
}
