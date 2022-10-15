import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {6,5,4,3,2,1};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is : "+Arrays.toString(arr));
    }
}
