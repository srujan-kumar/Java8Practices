package Java8Programs;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import static java.util.stream.LongStream.*;

/* Future: Introduced in Java 5, Future represents the result of an asynchronous computation. It provides methods to
            check if the computation is done, to wait for its completion, and to retrieve the result. However,
            its capabilities are quite basic and limited.

   CompletableFuture: Introduced in Java 8, CompletableFuture is an enhancement of Future. It not only represents a
                      future result but also provides a plethora of methods to compose, combine, execute asynchronous
                      tasks, and handle their results without blocking

Future: It is generally used with an ExecutorService, and we get a Future object when we submit tasks to the executor. However, it doesn’t allow us to define any computation steps to be executed once the computation is finished. The get() method is blocking, which means it waits until the task is completed and can make the application less responsive.

CompletableFuture: It can be used as a Future and also allows us to attach callbacks via methods like thenApply, thenAccept, and thenRun. These methods let us execute additional actions upon completion of the original task, in a non-blocking fashion. CompletableFuture can also be manually completed.

Asynchronous Execution Support
Future: Does not inherently support the execution of asynchronous code. It’s typically used with ExecutorService to execute Runnable or Callable tasks.

CompletableFuture: Offers built-in support for asynchronous execution with methods like supplyAsync, runAsync, and variants with custom Executor.

Use Cases
Future: Suitable for simple asynchronous operations where we need to perform tasks in a separate thread and retrieve the results later.

CompletableFuture: Ideal for complex asynchronous programming needs, including chaining multiple asynchronous operations, error handling, combining results, and implementing non-blocking algorithms.
hat sets CompletableFuture apart is its ability to manually complete the computation, reactively chain multiple steps of computation, and handle exceptions elegantly.
But there’s more to a CompletableFuture. Let’s break it down:

1. Dependent Actions: For tasks that aren’t asynchronous, the thread that finishes a CompletableFuture might run subsequent actions. Alternatively, any other thread calling a completion method might take up the baton.
2. Async Methods: If we don’t specify an executor, CompletableFuture uses a common pool (ForkJoinPool.commonPool()) for async tasks. However, if this pool can’t handle at least two parallel tasks, it creates a new thread for each task. Plus, for easier management and identification, all asynchronous tasks are marked as CompletableFuture.AsynchronousCompletionTask.
3. Independent CompletionStage Methods: All methods under CompletionStage are independent of CompletableFuture’s other public methods. This means their behaviour isn’t affected by how other methods are defined or overridden.
Now, when it comes to CompletableFuture as a Future:

4. Cancellation: Unlike FutureTask, CompletableFuture handles cancellation as a form of exceptional completion. Using the cancel method is equivalent to causing an exceptional completion with a CancellationException. We can use isCompletedExceptionally() to check if a CompletableFuture ended this way.

5. Handling Exceptions: If there’s an exceptional completion, the get methods throw an ExecutionException, carrying the same cause as the original CompletionException. To make things easier, CompletableFuture introduces join() and getNow(T) methods. These methods throw the CompletionException directly, making them more straightforward in most cases.

 */
public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // A CompletableFuture can be instantiated without arguments, providing a simple way to create a future that can be manually completed:
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        // This basic form of CompletableFuture allows for explicit completion. Before completion, any attempt to retrieve its result will lead to blocking.
        //Retrieving the Result: To access the result of the CompletableFuture, you can use the get() method:
        String result = completableFuture.get(); // This call blocks until the future completes
        // The get() method will block the calling thread indefinitely until the CompletableFuture is completed, which, in the initial state, means it could wait forever if the future is never explicitly completed

        // Completing the CompletableFuture: To prevent indefinite blocking and to supply a result to the waiting threads, you can complete the CompletableFuture manually
        completableFuture.complete("Completable Future Result");

        // Once the CompletableFuture is completed with a value, all clients waiting on get() will receive the specified result. Any attempts to complete the CompletableFuture again with complete() will be ignored, as a CompletableFuture can only be completed once.
        // runAsync and supplyAync methods --> The supplyAsync() method of CompletableFuture is used for asynchronous computations that return a result. Unlike runAsync(), which is used for tasks that don’t return anything, supplyAsync() takes a Supplier<U> and returns a CompletableFuture<U> where U is the type of the value obtained by the Supplier<U>. This method is particularly useful when we have a long-running computation that returns a value and you don’t want to block the main thread.
        // Example: Let’s consider an example where we need to calculate the sum of a large list of numbers. This kind of computation can be time-consuming, so we’ll perform it asynchronously using supplyAsync()

        // Creating a large list of numbers
        List<Long> numbers = LongStream.rangeClosed(1, 1_000_000L).boxed().collect(Collectors.toList());

        // Running the sum calculation asynchronously
        CompletableFuture<Long> sumFuture = CompletableFuture.supplyAsync(() -> sumOfList(numbers));

        // Do some other tasks if needed
        System.out.println("Main thread is free to run other tasks.");

        // Retrieve the result of the computation
        try {
            Long sum = sumFuture.get(); // This call is blocking, but the computation is already running asynchronously
            System.out.println("Sum of numbers: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed.");
    }




    private static Long sumOfList(List<Long> numbers) {
        return numbers.stream().reduce(0L, Long::sum);
    }



}
