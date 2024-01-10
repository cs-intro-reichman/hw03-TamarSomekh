/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        
        String ans = "";
        
        //a loop that will go through the string
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            //checking if ch is a space character
            if (ch == ' ') {
                ans = ans + ch;
            //checking if ch already excists in ans
            }else if (ans.indexOf(ch) == -1) {
                ans = ans + ch;
            }

            i++;
        }

        return ans;
    }
}