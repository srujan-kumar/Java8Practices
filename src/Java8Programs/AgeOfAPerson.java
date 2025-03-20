package Java8Programs;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfAPerson {
    public static void main(String[] args)
    {
        LocalDate birthDay = LocalDate.of(1987, 06, 04);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(birthDay, today));
    }
}
