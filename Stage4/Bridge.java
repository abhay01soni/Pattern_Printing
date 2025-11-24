package Stage4;

/*

 * * * * * * * * *
 * * * *   * * * *
 * * *       * * *
 * *           * *
 *               *

 */
import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nst = 1;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("  ");
            }
            nst += 2;
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
