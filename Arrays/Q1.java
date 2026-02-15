package Arrays;

// Multiply odd indexed element by 2 and add 10 to even indexed element?

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                System.out.print(arr[i] + 10 + " ");
            } else {
                System.out.print(arr[i] * 2 + " ");

            }
        }
    }
}
