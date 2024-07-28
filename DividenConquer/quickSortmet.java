public class quickSortmet {
    public static void printArr(int arr[]){
        for ( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        // base case
        if ( si >= ei){
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei); // this is the partion function which gets the small element to left and big to right
        quickSort(arr, si , pIdx-1); // left part
        quickSort(arr, pIdx+1, ei); // right part
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for eles smaller than pivot

        for (int j=si; j<ei; j++){
            if (arr[j] <= pivot){  // is current ele is less than pivot
                i++;                // so make place for the ele
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5,-2};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
