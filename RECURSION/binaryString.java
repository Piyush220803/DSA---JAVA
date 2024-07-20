public class binaryString {
    public static int printBinString( int n, int prevPlace, String str){
        // Base case

        if ( n == 0){
            System.out.println(str);
            return;
        }

        // kaam
        printBinString(n - 1, 0, str+"0");

        if ( prevPlace == 0){
            printBinString(n - 1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        System.out.println(printBinString(3, 0, ""));
    }
}
