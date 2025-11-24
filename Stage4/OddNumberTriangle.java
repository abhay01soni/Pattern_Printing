package Stage4;
/*

1
1 3
1 3 5
1 3 5 7

 */
import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        int a = 1;
            for (int j = 1; j <= i; j++) {
                    System.out.print(a+" ");
                    a+=2;

            }
            System.out.println();
        }
    }
}
