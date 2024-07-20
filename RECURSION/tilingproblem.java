public class tilingproblem {
    public static int tilingproblem( int n){  // 2 X n floor size
        // base case

        if ( n == 0 || n == 1){
            return 1;
        }
        // kaam
        // vertical
        // int fnm1 = tilingproblem(n - 1);

        // // horizontal
        // int fnm2 = tilingproblem( n - 2);

        // int totalWays = fnm1 + fnm2;

        return (tilingproblem(n - 1) + tilingproblem(n - 2));
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
    }
}
