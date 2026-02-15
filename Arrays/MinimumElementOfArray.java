package Arrays;

public class MinimumElementOfArray {
    public static void main(String[] args) {
        int[] arr = {4,-5,87,55,25,1,65,3};
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]) min =arr[i];
        }
        System.out.println(min);
    }
}
