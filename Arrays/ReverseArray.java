package Arrays;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {13, 3, 55, 25, 6, 77, 75, 74, 3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void reverse(int[] arr){
            int n = arr.length;
            int i = 0, j = n - 1;
            while (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
//        for(int  ele : arr){
//            System.out.print(ele+ " ");
//        }

    }

