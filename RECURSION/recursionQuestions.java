public class recursionQuestions {
    // public static void allOccurance( int arr[], int key , int i){
    //     // Base case
    //     if ( i == arr.length){
    //         return;
    //     }
    //     // Kaam
    //     if ( arr[i] == key){
    //         System.out.print(i+" ");
    //     }
    //     allOccurance(arr, key, i + 1);
    // }

    // public static void main(String[] args) {
    //     int arr[] = {3,2,4,5,6,2,7,2,2};
    //     int key = 2;
    //     int i = 0; // declare and initialize 'i' variable
    //     allOccurance(arr, key, i + 1);
    // }
    // static final String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    // public static String numToWords( int num ){
    //     // Base case
    //     if ( num == 0 ){
    //         return "";
    //     }
    //     return numToWords(num / 10)+" "+digits[num % 10];
    
    // }
    // public static void main(String[] args) {
    //     int number = 19050;
    //     System.out.println(numToWords(number));
    // }

    // Find length of String Using recursion
    public static int Stringlength( String str){
        // Base case
        if ( str.length() == 0){
            return 0;
        }
         return Stringlength(str.substring(1)) + 1;
    }

    public static void main( String args[]){
        String str = "abcdeijij";
        System.out.println(Stringlength(str));
    }

}
