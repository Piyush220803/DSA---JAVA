//package RECURSION;

public class recursionbasic {
    // Decreasing order
    public static void printDec(int n){                       // The name of Function and the recursive function will be same
        if ( n == 1){                                         // as here printDec function name and princtDec recursive function name
            System.out.println(n);                             // is same.
            return;
        }
        System.out.print(n+" ");
        printDec(n - 1); // Recursive function
    }

    // Increasing order

    public static void printInc(int n){
        if ( n == 1){
           System.out.print(n+" ");
           return;
        }
        printInc(n - 1);
        System.out.print(n+" ");
    }

    // Print factorial of N

    public static int factOfN(int n){
        if ( n == 0){
            return 1;
        }
        int fnm1 = factOfN(n - 1);
        int factorial = n * factOfN(n - 1);
        return factorial;
    }

    // Print sum of n numbers

    public static int sumOfn(int n){
        if ( n == 1){
            return n;
        }
        int Snm1 = sumOfn(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // Fibonacci series

    public static int fib(int n){
        if ( n == 0 || n == 1){
            return 1;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fib = fnm1 + fnm2;
        return fib;
    }

    // Check array is sorted or not

    public static boolean isSorted(int arr[], int i){
        if ( i == arr.length - 1){
            return true;
        }

        if (arr[i] > arr[i + 1]){
            return false;
        }
        
        return isSorted(arr, i + 1);
    }

    // First Occurance

    public static int firstOccurance(int arr[], int key, int i){
        if ( i == arr.length - 1){
            return -1;
        }

        if ( arr[i] == key){
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }

    // Last Occurance

    public static int lastOccurance(int arr[], int key, int i){
        if ( i == arr.length ){
            return -1;
        }

        int isFound = lastOccurance(arr, key, i + 1);
        if ( isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    // Print x^n

    public static int power( int x, int n){
        if ( n == 0){
            return 1;
        }

        return x * power(x, n - 1);
    }
    public static void main(String[] args) {

        System.out.println(power(2, 5));
        // int arr[] = { 1, 2, 3, 4, 5, 4};
        // System.out.println(lastOccurance(arr, 4, 0));
       // System.out.println(isSorted(arr, 0));
       // int n = 20;
       // System.out.println(fib(n));
        // System.out.println(fib(26));
        // System.out.println(fib(27));
        // System.out.println(fib(28));
    }
}
