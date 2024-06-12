package corejavaprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// REf https://www.youtube.com/watch?v=Zeoe2o-QIj0&list=PLFGoYjJG_fqpcoeCZsi_czihPa4GoFtrL&index=51
public class RepeatedWordInAFileIMP {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Srujan_Kundurthi/Desktop/Code Repos for Interview/Java8 Practices/src/corejavaprograms/demo.txt";
        int wordCount = 0;
        BufferedReader reader = null;
        Map<String, Integer> wordMap=new HashMap<String, Integer>();

        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine().trim();
            while (currentLine != null) {
                String words[] = currentLine.split(" ");

                for (String word : words) {
                    if(!word.isBlank()) {
                        if (wordMap.containsKey(word)) {
                            wordMap.put(word, wordMap.get(word) + 1);
                        } else {
                            wordMap.put(word, 1);
                        }
                    }
                }
                currentLine = reader.readLine();
            }

            System.out.println("Word Count -->" + wordCount);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
        wordMap.forEach((k,v)-> System.out.println("K-->"+k+"V-->"+v ));
        Map<String,Integer> maxMap=new HashMap<>();
        //
        wordMap.entrySet().stream().filter(entry->entry.getValue()== Collections.max(wordMap.values()))
                .forEach(e->maxMap.put(e.getKey(),e.getValue()));
        System.out.println("MAX Word Result is -->"+maxMap);

    }
}
