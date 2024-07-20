public class removeDuplicates {

    // By CoPilot
    // public class removeDuplicates {
    //     public static String removeDuplicates(String str) {
    //         // Base case: if the string is empty or has only one character, return the string as is
    //         if (str == null || str.length() <= 1) {
    //             return str;
    //         }
            
    //         // Check if the first character is the same as the second character
    //         if (str.charAt(0) == str.charAt(1)) {
    //             // If they are the same, recursively call the function on the substring starting from the second character
    //             return removeDuplicates(str.substring(1));
    //         } else {
    //             // If they are different, recursively call the function on the substring starting from the second character
    //             // and append the first character to the result
    //             return str.charAt(0) + removeDuplicates(str.substring(1));
    //         }
    //     }
        
    //     public static void main(String[] args) {
    //         String str = "Helloo";
    //         String result = removeDuplicates(str);
    //         System.out.println(result);
    //     }
    // }

    // BY ME
    public static void removeDuplicates( String str, int idx, StringBuilder newStr, boolean[] map){
        // base case

        if ( idx == str.length()){
            System.out.println(newStr);
            return ;
        }

        // kaam

        char currChar = str.charAt(idx);
        if ( map[currChar - 'a'] == true){
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
