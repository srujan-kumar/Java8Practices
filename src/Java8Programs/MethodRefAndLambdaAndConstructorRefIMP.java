package Java8Programs;
//if interface method implementation already available at some place, then we can use Method Ref,
// else use Lamda Expression
// *** Constructor Ref--> If our functional Interface abstract method return type is an Object,then use Construstor Ref
interface Interf{
    public void add(int a, int b);
}
// start of  Constructor Ref Example Purpose code
class Sample{
    Sample(){
        System.out.println("Sample Class Constructor Exec");
    }
}

interface Interface1{
    public Sample get();
}
// End of Constructor Ref Example Purpose code
public class MethodRefAndLambdaAndConstructorRefIMP {
    public static void sum(int x, int y){
        System.out.println("The sum of Method ref is -->"+(x+y));
    }
    public static void main(String[] args) {
        Interf i=(a,b)-> System.out.println("The Sum of Lamad Example is -->"+(a+b));
        i.add(10,20); // lamda
        Interf i1=MethodRefAndLambdaAndConstructorRefIMP::sum;
        i1.add(100,300);//** please not we are not calling sum method, we have to call Interface method, in interafce we dont have sum method

        //****  Start of Constructor Ref code. using Constructor Ref how we are calling Interface method
        Interface1 i2=Sample::new;
        Sample s1=i2.get();// i.e. Interface get method refers to Sample class Obj
        // End of Conctsructor Ref code
    }
}
