package Stage4;
/*

 *       *
   *   *
     *
   *   *
 *       *

 */
import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 1; i<=n; i++){
            int a = n+1-i;
            for(int j =1; j<=n; j++){
                if( i==j || j == a){
                System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
