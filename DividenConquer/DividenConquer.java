public class DividenConquer{
    public static void printArr( int arr[] ){
        for( int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
   
 // Recursive function
 public static void mergeSort(int arr[], int si, int ei){
    // base case
    if( si >= ei){
        return;
    }
    // kaam
    int mid = si + (ei - si)/2;
    mergeSort(arr, si, mid); // left part
    mergeSort(arr, mid+1, ei); // right part
    merge(arr, si, mid, ei); // lastly for merging both part
}
public static void merge(int arr[], int si, int mid, int ei){
    int temp[] = new int[ei - si + 1]; // temporary array for storing merge part
    int i = si;
    int j = mid + 1;
    int k = 0;
    while( i <= mid && j <= ei){
        if( arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }
    while( i <= mid){
        temp[k++] = arr[i++];
     }
     while( j <= ei){
        temp[k++] = arr[j++];
     }
     
     // Copy the merged array back to the original array
     for (int m = 0; m < temp.length; m++) {
         arr[si + m] = temp[m];
     }
 }
public static void main(String[] args) {
    int arr[] = {6,3,9,5,2,8,-8};
    mergeSort(arr, 0, arr.length - 1);
    printArr(arr);
    }
 }
