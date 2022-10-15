import java.util.Arrays;

class SortQuick{
    public int[] QuickSort(int[] arr,int low,int high){
        if(low <= high){
            int pi = partition(arr,low,high);
            QuickSort(arr,pi+1,high);
            QuickSort(arr,low,pi-1);
        }
        return arr;
    }

    public int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i = i+1;
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

public class Quick {
    public static void main(String[] args) {
        SortQuick obj = new SortQuick();
        int[] arr = {6,5,4,3,2,1};
        int[] result = obj.QuickSort(arr,0, arr.length-1);
        System.out.println("The sorted array is : "+ Arrays.toString(result));
    }
}
