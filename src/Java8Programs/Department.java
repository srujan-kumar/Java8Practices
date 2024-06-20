package Java8Programs;

import java.util.List;

public class Department {
    int deptNo;
    String deptName;
    List<Employee> employeeList;

    public Department(int deptNo, String deptName, List<Employee> employeeList) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
