public class avdpatterns {
    // inverted rotated half pyramid
    public static void main(String[] args) {
         int n = 5;

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= rows-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = i; k <= rows; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Butterfly Pattern
        // 1st half
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // 2nd half
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Hollow rhombus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}      

 


