package Java8Programs;
// str.chars().
public class PartciularCharOccuranceCount {
    public static void main(String[] args) {
        String str="Testing Solutions";
        long count=str.chars().filter(e->(char)e=='s').count();
        System.out.println("Count of Character S is -->"+count);

    }
}
