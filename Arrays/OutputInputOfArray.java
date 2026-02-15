package Arrays;

import java.util.Scanner;

public class OutputInputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5,-8,2,67,43,-97,5,34,56,7,3};
//        System.out.println(arr.length);
//        int n = arr.length; // index 0 to n-1
//
//        for(int i = 0; i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        int[] abhay = new int[7]; // By Default value of arrray is zero
//        for(int i=0; i<7; i++){
//            System.out.print(abhay[i]+" ");
//        }

        //input
        for(int i = 0; i<7; i++){
            abhay[i] = sc.nextInt();
        }

        //output
        for(int i =0;i<7;i++){
            System.out.print(abhay[i]+" ");
        }

    }
}
