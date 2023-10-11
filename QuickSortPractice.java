public class QuickSortPractice {
    public static void main(String[] args) {
        int[] arr = {10, 16, 8, 12, 15, 6, 3, 9, 5};
        int n = arr.length-1;
        quicksort(arr, 0, n);
        System.out.println("The sorted array is : ");
        printArr(arr);
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int m = partition(arr, low, high);
            quicksort(arr, low, m-1);
            quicksort(arr, m+1, high);
        }
    }
    public static int partition(int[] arr, int low , int high){
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[j] = temp;
    }
    static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
