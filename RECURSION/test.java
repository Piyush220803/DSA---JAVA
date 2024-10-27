public class test {
    // Method to calculate the nth Fibonacci number using recursion
    public static int fib(int n) {
        // Base cases: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call to calculate the (n-1)th Fibonacci number
        int fnm1 = fib(n - 1);
        // Recursive call to calculate the (n-2)th Fibonacci number
        int fnm2 = fib(n - 2);
        // Sum of the two previous Fibonacci numbers
        int fibo = fnm1 + fnm2;
        // Return the nth Fibonacci number
        return fibo;
    }

    public static void main(String[] args) {
        // Print the nth Fibonacci number
        System.out.println(fib(4));
    }
}
