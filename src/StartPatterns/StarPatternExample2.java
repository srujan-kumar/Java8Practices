package StartPatterns;

/**
 *          Start Pattern looking for
 *           * * * * *
 *           * * * *
 *           * * *
 *           * *
 *           *
 */
public class StarPatternExample2 {
    public static void main(String[] args) {
        System.out.println("");
        for(int i=0;i<5;i++){
            for (int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
