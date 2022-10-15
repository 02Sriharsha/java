import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,3,5,7,9,9,66,4};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i]; //5
            int j = i-1; //0
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("The sorted array is : "+ Arrays.toString(arr));
    }
}
