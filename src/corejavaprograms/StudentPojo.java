package corejavaprograms;

public class StudentPojo {

    private String name;
    private int sno;
    private int marks;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentPojo(String name, int sno, int marks, int age) {
        this.name = name;
        this.sno = sno;
        this.marks = marks;
        this.age = age;
    }
}
