// public class patterns {
//     public static void main(String[] args) {
        
//         for (int line = 1; line<=4; line++){
//             // one line
//              for (int i = 1; i<=line; i++){
//                 System.out.print("*");
//              }
//              System.out.println();  // to give the next line after one line
//         }
//     }
// }

// Inverted star pattern

// public class patterns {

//     public static void main(String[] args) {
//         //int n = 4;
        
//         for (int line = 1; line<=4; line++){  // jaha jaha par 4 hai waha pr n bhi likh sakate hai

//             for (int star=1; star<=4-line+1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Print half pyramid pattern

public class patterns {

    public static void main(String[] args) {
        
        int n = 4;
        for(int line = 1; line<=n; line++){
            for (int number = 1; number<=line; number++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}


// Print character pattern

// public class patterns {

//     public static void main(String[] args) {
//         int n = 4;
//         char ch = 'A';

//         for (int line = 1; line<=n; line++){
//             for (int chars = 1; chars<=line; chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }