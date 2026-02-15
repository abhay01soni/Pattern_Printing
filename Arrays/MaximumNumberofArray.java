package Arrays;

public class MaximumNumberofArray {
    public static void main(String[] args) {
        int[] arr = {4,-5,87,55,25,1,65,3};
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]) max =arr[i];
        }
        System.out.println(max);
    }
}
