package corejavaprograms;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

/*  In Java, the Try-with-resources statement is a try statement that declares one or more resources in it. A resource is an object that must be closed once your program is done using it. For example, a File resource or a Socket connection resource.
The try-with-resources statement ensures that each resource is closed at the end of the statement execution.
If we don&rsquo;t close the resources, it may constitute a resource leak and also the program could exhaust the resources available to it.
You can pass any object as a resource that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable.
By this, now we don&rsquo;t need to add an extra finally block for just passing the closing statements of the resources.
The resources will be closed as soon as the try-catch block is executed.

-----------------**** Why We need Try with Resource **** -------------------
The main problem with try finally approach is, if you get an error while in the try part of your open InputStream, and you get an error rather than opening the stream
 like you get an error because you tried to run .readLines(), and because of the same reason the code in your finally part, .close(), fails and throws an Exception,
 you will not be able to view the first exception. This gives you a hard time when debugging is required in such cases.

When Java 7 introduced try(withResources) that solves this problem. Your resource needs to implement an AutoClosable interface, and then the latter exceptions are
 suppressed and the first one is thrown. It also allows you to still access all of the suppressed exceptions, even programmatically using getSuppressed().
*/

public class TryWithResourceAndTryWithFinally {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("outputfile.txt");

             // Adding resource Reading the stream of character from
             BufferedReader br = new BufferedReader(
                     new FileReader("demo.txt"))) {

            // Declaring a string holding the stream content of the file
            String text;

            // Condition check using readLine() method which holds true till there is content in the input file
            while ((text = br.readLine()) != null) {

                // Reading from input file passed above using getBytes() method
                byte arr[] = text.getBytes();

                // String converted to bytes
                fos.write(arr);

                // Copying the content of passed input file 'inputgfgtext' file to outputfile.txt
            }

            // Display message when file is successfully copied
            System.out.println(
                    "File content copied to another one.");
        }

        // Catch block to handle generic exceptions
        catch (Exception e) {

            // Display the exception on the console window
            System.out.println(e);
        }
    }
}
