package StartPatterns;
/**
 *         Pattern I am looking for
 *         *
 *         * *
 *         * * *
 *         * * * *
 *         * * * * *
 *         * * * *
 *         * * *
 *         * *
 *         *
 */
public class StarPatternExample3 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<5;i++){
            for (int j=4;j>i;j--){  //j>i is the difference
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
