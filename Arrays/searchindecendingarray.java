package Arrays;

import java.util.Scanner;

public class searchindecendingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {99, 88, 77, 66, 55, 44, 33, 22, 11, 9, 8, 7, 2, 1};
        int n = arr.length;
        int low = 0;
        int high = n - 1;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (arr[mid] == target) {
                    System.out.println(mid);
                    break;
                } else if (arr[mid] < target) high = mid - 1;
                else if (arr[mid] > target) {
                    low = mid + 1;
                }
              }

            System.out.print("Not found");
    }
}
