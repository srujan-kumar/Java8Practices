package Java8Programs;

import java.util.function.BiFunction;

/*  BiFunction Interface has been introduced since Java 8. It represents a function
which takes in two arguments and produces a result.

T: denotes the type of the first argument to the function
U: denotes the type of the second argument to the function
R: denotes the return type of the function

The main advantage of using a BiFunction is that it allows us to use 2 input arguments,
while in function we can only have 1 input argument.

BiFunction interface consists of the following two functions:

1. apply()
    R apply(T t, U u)
    Parameters: This method takes two parameters and returns result of Type R

    t– the first function argument
    u– the second function argument

2.andThen()
    It returns a composed function wherein the parameterized function will be executed after
    the first one. If evaluation of either function throws an error, it is relayed to the
    caller of the composed function.

   Note:The function being passed as the argument should be of type Function and not BiFunction.





 */
public class BiFunctionInterfaceExample {
    public static void main(String[] args) {

        /* apply method Example  */

        // BiFunction to add 2 numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Implement add using apply()
        System.out.println("Sum = " + add.apply(2, 3));

        // BiFunction to multiply 2 numbers
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Implement add using apply()
        System.out.println("Product = " + multiply.apply(2, 3));

        /* andThen() Example    */

        // BiFunction to demonstrate composite functions
        // Here it will find the sum of two integers
        // and then return twice their sum
        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b;

        // Using andThen() method
        composite1 = composite1.andThen(a -> 2 * a);

        // Printing the results
        System.out.println("Composite1 = " + composite1.apply(2, 3));

        // BiFunction to demonstrate composite functions
        // Here it will find the sum of two integers
        // and then return twice their sum
        BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b;

        // Using andThen() method
        composite2 = composite2.andThen(a -> 3 * a);

        // Printing the result
        System.out.println("Composite2 = " + composite2.apply(2, 3));

        // ** The below Example Throws NullPointer Exception
        BiFunction<Integer, Integer, Integer> composite = (a, b) -> a + b;

        try {
            // Using andThen() method
            composite = composite.andThen(null);

            // Printing the result
            System.out.println("Composite = " + composite.apply(2, 3));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
