public class rotatedArray {
    public static int search(int arr[], int tar, int si, int ei){
        // Base case
        if( si>ei ){
            return -1;
        }
        // kaam
        int mid = si + (ei - si)/2;

        // if mid is target element
        if( arr[mid] == tar){
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]){
            // case A: left
            if ( arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                // case B: right
               return search(arr, tar, mid+1, ei);
            }
        }
        // mid on L2
        if (arr[mid] <= tar && tar <= arr[ei]){
            // case C: right
            return search(arr, tar, mid+1, ei);
            }else {
            // case D: left
            return search(arr, tar, si, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
