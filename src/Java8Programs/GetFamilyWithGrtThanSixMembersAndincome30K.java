package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GetFamilyWithGrtThanSixMembersAndincome30K {
    // get Family details whose family memebers >6, and income >30K
    public static void main(String[] args) {
        List<Family> familyList=new ArrayList<>();
        familyList.add(new Family(4, 25000));
        familyList.add(new Family(8, 95000));
        familyList.add(new Family(10, 25000));
        familyList.add(new Family(7, 55000));
        familyList.add(new Family(3, 48000));
       //Predicate<Integer> familycount=family->family.getClass().>6;
        familyList.stream().filter(family->family.getTotalFamilyMembers()>6).filter(family->family.getIncome()>30000).collect(Collectors.toList()).forEach(System.out::println);


    }
}
