package Java8Programs;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
/*
    Predicate will always take some input and it will return boolean value ->test() method
    Function will always take some input and it will return any value ->apply() method
    Consumer will always take some input and it wont return any value ->accept() method

    Predicate<T> --> Boolean
    Function<T,R> --> R type as return value
    Consumer<T> -> Void

 */
// Function is a Functional Interface in java8, if you want to read some input perform some operation
// and return some value, go for FUnction Interface. It has "apply" method
class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class FunctionFunctionalInterfaceJava8IMP {
    public static void main(String[] args) {
        Function<Integer,Integer> f= i->i*i;
        System.out.println(f.apply(10));
        System.out.println(f.apply(6));

        Function<String,Integer>f1=s->s.length();
        System.out.println(f1.apply("Naveen Automation Labs"));

        Function<String,String>f2=s->s.toUpperCase();
        System.out.println(f2.apply("Naveen Automation Labs"));

        // Very Good Example ***** Real time
        Function<Student,String> f3=s->{
            int marks= s.marks;
            String grade="";
            if(marks>=80) grade="Distinction";
            else if(marks>=60) grade="First Class";
            else if(marks>=45) grade="Second Class";
            else if(marks>=35) grade="PASS";
            else grade="FAIL";
            return grade;
        };
        Student[] students={
                new Student("RAM", 70),
                new Student("DHEERAJ", 86),
                new Student("SUBHANI", 9),
                new Student("SURESH", 80),
                new Student("RAVI", 45)
        };
        for(Student s1:students){
            System.out.print("Student name "+s1.name);
            System.out.print(" Student marks "+s1.marks);
            System.out.println(" Student grade--> "+f3.apply(s1));
        }

        // ***** Fetch student details whose marks greater than 60 -->
        // Combination of Predicate and Functional Interface is needed
        Predicate<Student> p2=s->s.marks>=60;
        System.out.print("Student Details Greater than or equal to 60");
        Consumer<Student> c= s1->{
            System.out.print("Student name with Consumer functionality " + s1.name);
            System.out.print(" Student marks " + s1.marks);
            System.out.println(" Student grade--> " + f3.apply(s1));
        };
        for(Student s1:students){
            if(p2.test(s1)) {
               c.accept(s1);
            }
        }
    }
}
