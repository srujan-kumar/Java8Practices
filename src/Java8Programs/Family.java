package Java8Programs;

public class Family {
    int totalFamilyMembers;
    double income;

    public int getTotalFamilyMembers() {
        return totalFamilyMembers;
    }

    public void setTotalFamilyMembers(int totalFamilyMembers) {
        this.totalFamilyMembers = totalFamilyMembers;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public Family(int totalFamilyMembers, double income) {
        this.totalFamilyMembers = totalFamilyMembers;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Family{" +
                "totalFamilyMembers=" + totalFamilyMembers +
                ", income=" + income +
                '}';
    }
}
