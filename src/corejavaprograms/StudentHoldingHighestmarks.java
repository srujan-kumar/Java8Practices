package corejavaprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentHoldingHighestmarks {
    public static void main(String[] args) {
        StudentPojo student1=new StudentPojo("Rahul", 1, 75, 15);
        StudentPojo student2=new StudentPojo("Rajesh", 2, 60, 16);
        StudentPojo student3=new StudentPojo("Sanjay", 3, 90, 17);
        StudentPojo student4=new StudentPojo("Ramesh", 4, 80, 18);
        List<StudentPojo> studentList=new ArrayList<StudentPojo>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        int highestMarks=studentList.stream().map(e->e.getMarks()).max(Integer::compare).get();
        studentList.stream().filter(e->e.getMarks()==highestMarks).forEach(e-> System.out.println(e));

        // Studens who got greater than 75 marks
        studentList.stream().filter(e->e.getMarks()>75).map(emp->emp).forEach(emp-> System.out.println(emp));


    }
}
