package Arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,3,27,53,18,62,88,6};
        int target = 53;
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found = true;;
                break;
            }
        }
        if(found == true) System.out.println("Target exists");
        else System.out.println("target missing");
    }
}
