import java.util.Arrays;

class Sort{
    public int[] quickSort(int[] arr, int low , int high){
        if(low<=high){
            int pi = partition(arr,low,high);
            quickSort(arr,pi+1,high);
            quickSort(arr,low,pi-1);
        }
        return arr;
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}

public class QuickSort{
    public static void main(String[] args) {
        Sort s = new Sort();
        int[] arr = {9,3,1,67,7,3,2,0,55,89,34};
        int[] result = s.quickSort(arr,0,arr.length-1);
        System.out.println("The sorted array is : "+Arrays.toString(result));
    }
}