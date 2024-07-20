// public class advpatterns {
//     public static void hollow_Rectangle(int totRows, int totCols){

//         for(int i=1; i<=totRows; i++){
//             for(int j=1; j<=totCols; j++){
//                 if(i==1 || i==totRows || j==1 || j==totCols){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
//     public static void main(String[] args) {
//         hollow_Rectangle(10, 7);
//     }
// }


// Inverted and Rotated half pyramid

// i is line number and n is total number of line

// public class advpatterns {

//     public static void invNrotHalf(int n){
//         for(int i=1; i<=n; i++){     // for outer loop
//                 for(int spaces=1; spaces<=n-i; spaces++){    // for spaces
//                     System.out.print(" ");
//                 }
//                 for(int star=1; star<=i; star++){             // for star
//                     System.out.print("*");
//                 }
//                 System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         invNrotHalf(7);
//     }
// }


// Butter fly pattern

// public class advpatterns {

//     public static void butterFly(int n){

//         // 1st half
//         for(int i=1; i<=n; i++){  // inner loop
//             //stars
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             // spaces
//             for(int j=1; j<=2*(n-i); j++){
//             System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=n; j ++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // 2nd half (inverted or mirror)
//         for(int i=n; i>=1; i--){  // inner loop
//             //stars
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             // spaces
//             for(int j=1; j<=2*(n-i); j++){
//             System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         butterFly(5);
//     }
// }


// Solid rhombus

// public class advpatterns {

//     public static void solid_Rhombas(int n){
//         // outer loop
//         for (int i=1; i<=n; i++){
//             // inner loop
//             // spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for(int j=1; j<=n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         solid_Rhombas(5);
//     }
// }

// Hollow rhombus

// public class advpatterns {

//     public static void hollow_Rhombus(int n){
//          // outer loop
//          for(int i=1; i<=n; i++){
//             // inner loop
//             // spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//          }
//     }
//     public static void main(String[] args) {
//         hollow_Rhombus(5);
//     }
// }

// Diamond pattern

public class advpatterns {

    public static void Diamond_pattern(int n){
        // 1st half
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        // outer loop(inverted of 1st half)
        for(int i=n; i>=1; i--){
            // inner loop
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Diamond_pattern(4);
    }
}
