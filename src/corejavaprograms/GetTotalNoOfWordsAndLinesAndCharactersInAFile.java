package corejavaprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetTotalNoOfWordsAndLinesAndCharactersInAFile {

    public static void main(String[] args) throws IOException {
        String path = "C:/Users/Srujan_Kundurthi/Desktop/Code Repos for Interview/Java8 Practices/src/corejavaprograms/demo.txt";

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String currentLine = reader.readLine().trim();
            while (currentLine != null) {
                lineCount++;
                String words[] = currentLine.split(" ");
                wordCount = wordCount + words.length;
                for (String word : words) {
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
            System.out.println("Line Count -->" + lineCount);
            System.out.println("Word Count -->" + wordCount);
            System.out.println("Character Count -->" + charCount);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }

    }
}
