package Arrays;

import java.util.Scanner;

public class PrintNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elemts of Array : ");
        for(int i =0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n; i++){
           if(arr[i]<0) System.out.print(arr[i]+ " ");
        }

    }
}
