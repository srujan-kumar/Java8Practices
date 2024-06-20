package Java8Programs;

public class Employee {
    int eno;
    String ename;
    long esal;
    String department;

    String firstName;
    String lastName;

    public Employee(int eno,String firstName, String lastName) {
        this.eno = eno;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int eno, String ename, long esal) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(int eno, String ename, long esal, String department) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.department = department;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public long getEsal() {
        return esal;
    }

    public void setEsal(long esal) {
        this.esal = esal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "eno=" + eno +
//                ", ename=" + ename +
//                ", esal=" + esal +
//                ", department=" + department +
//                '}';
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", esal=" + esal +
                ", department='" + department + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
