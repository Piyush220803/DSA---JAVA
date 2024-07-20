public class friendPairProblem {
    public static int friendPairProblem(int n){
        // base case
        if ( n == 1 || n == 2){
            return n;
        }

        return (friendPairProblem(n - 1) + (n - 1) * friendPairProblem(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(friendPairProblem(4));
    }
}
