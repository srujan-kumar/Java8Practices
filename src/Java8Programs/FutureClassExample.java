package Java8Programs;

import java.util.concurrent.*;

// ref taken from https://medium.com/@reetesh043/future-interface-in-java-ef9ade2b97b0
/*  The Future interface, part of the java.util.concurrent package represents the result of
an asynchronous computation. A Future object returns from a computation when it is complete,
 but the computation itself runs in a separate thread, allowing the program to continue doing other work in the meantime

Key Characteristics:
1) Asynchronous Execution: Future allows the execution of long-running operations in a background thread,
                           preventing the blocking of the main thread.
2) Result Retrieval: It provides methods to check if the computation is complete, to wait for its completion, and to
                            retrieve the result.
3) Cancelable Operations: A Future can be used to cancel the execution of an asynchronous operation.

Steps needs to perform:
Step 1: Creating an ExecutorService: First, we need an ExecutorService to submit tasks:
Step 2: Submitting a Callable Task: We then define and submit a Callable task to the executor:
Step 3: Retrieving the Result: Finally, we retrieve the result of the computation:

Additional Operations
Check if the Task is Complete: We can check if the computation is done by using futureResult.isDone().
Cancel the Task: If we need to cancel the computation, we can use futureResult.cancel(true).
Timeouts: We can set a timeout on the get() method to prevent indefinite blocking.




 */
public class FutureClassExample {
    public static void main(String[] args) {
        //Step1
        ExecutorService executor = Executors.newSingleThreadExecutor();

        //Step2 --> Here, submit() returns a Future representing the pending result.
        Future<Integer> futureResult = executor.submit(() -> {
            // Simulating a long-running task
            TimeUnit.SECONDS.sleep(2);
            return 42; // The result of the computation
        });

        //Step3 -->The get() method blocks until the computation is complete, after which it returns the result.
        try {
            Integer result = futureResult.get(); // Blocking call
            System.out.println("Result of the computation: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // O/P is --> Result of the computation: 42



    }
}
