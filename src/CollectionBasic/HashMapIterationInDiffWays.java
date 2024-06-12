package CollectionBasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterationInDiffWays {
    public static void main(String args[]){
        Map<String,Double> contactDetails=new HashMap<>();
        contactDetails.put("Sreenu", 9948151629d);
        contactDetails.put("Sandeep", 9948151628d);
        contactDetails.put("Suresh", 9948151627d);
        contactDetails.put("Srujan", 9948151626d);
        contactDetails.put("Sunil", 9948151625d);
        contactDetails.put("Sateesh", 9948151624d);

        // Using EntrySet
        Set<Map.Entry<String,Double>> entrySet=contactDetails.entrySet();
        Iterator<Map.Entry<String,Double>> contactsItr =entrySet.iterator();
        while(contactsItr.hasNext()){
            Map.Entry<String,Double> contacts=contactsItr.next();
            System.out.println(""+contacts.getKey()+" Phone Number is -->"+contacts.getValue());
        }

        // Using Enhanced for loop
        for (Map.Entry<String,Double> entry : contactDetails.entrySet())
            System.out.println("Entry = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        //Using forEach of JAVA8
        contactDetails.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));


    }
}
