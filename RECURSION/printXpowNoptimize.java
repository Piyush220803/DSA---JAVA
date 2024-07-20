public class printXpowNoptimize {

    public static int Optimizedpower( int x, int n){
        if ( n == 0){
            return 1;
        }
        // n is even
        int halfpower = Optimizedpower(x, n/2);
        int halfpowersq = halfpower * halfpower;

        // n is odd
        if ( n % 2 != 0){
            halfpowersq = x * halfpowersq;
        }

        return halfpowersq;
    }
    public static void main ( String args []){
        int x = 2;
        int n = 5;
        System.out.println(Optimizedpower(x, n));
    }
}
