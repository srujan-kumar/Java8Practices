package Java8Programs;

import java.util.function.Function;

//two functions can be combined to acheive complex functionality
//f1.andThen(f2).apply(i) --> first f1 will excecute and then f2 . (f1, F2 are functional interfaces)
//f1.compose(f2).apply(i) --> first f2 will executed, and then f1
public class FunctionChainingJava8IMP {
    public static void main(String[] args) {
        Function<Integer,Integer> f1= i->i*2;
        Function<Integer,Integer> f2= i->i*i*i;
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}

