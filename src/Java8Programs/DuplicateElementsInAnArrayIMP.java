package Java8Programs;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsInAnArrayIMP {
    // Approach1 --> Brute Force
    // Approach 2 --> Hash set
    // Approach 3--> HashMap
    // Approach 4 --> Streams
    public static void main(String[] args) {
        String elements[] = {"Amazon", "GCP", "Azure", "Amazon", "Ali baba", "Sause Labs", "Azure", "GCP"};

        // Brute Force
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    System.out.println("Duplicate Elements with Brute Force are --> " + elements[i]);
                }
            }
        }

            // HashSet

            Set<String> values = new HashSet<String>();
            for (String ele : elements) {
                if (!values.add(ele)) {
                    System.out.println("Duplicate Element with hashset are --> " + ele);
                }
            }

            //HashMap
            Map<String, Integer> eleMap = new HashMap<>();
            for (String ele : elements) {
                // dont use int in below line it is throwing null Pointer Exception
                Integer count = eleMap.get(ele);
                if (count ==null) {
                    eleMap.put(ele, 1);
                } else {
                    eleMap.put(ele, eleMap.get(ele) + 1);
                }
            }

            Set<Map.Entry<String, Integer>> eleMapEntrySet= eleMap.entrySet();
            for(Map.Entry<String, Integer> entry:eleMapEntrySet){
                if(entry.getValue()>1){
                    System.out.println("Duplicate Element with HashMap are -->" + entry.getKey());
                }

            }

            // Streams IMP ****(Collections.frequency)
        List<String> listelements=Arrays.asList(elements);
        Set <String> dupEleCheck=listelements.stream().filter(ele->
                Collections.frequency(listelements,ele)>1).collect(Collectors.toSet());
        System.out.println("Duplicate Element with Streams are -->" + dupEleCheck);
        }
    }

