package Arrays;

public class Segrigate {
    public static void main(String[] args) {
        int[] arr = { 1,1,0,0,1,1,1};
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<=j){
            if(arr[i] == 0 && arr[j] == 1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
           for(int ele :arr){
               System.out.println(ele+" ");
           }
    }
}
