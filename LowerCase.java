/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        
        String ans = "" ;
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            //checking if ch is a letter
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                //if the letter is uppercase
                //changing it to lowercase
                if (ch >= 'A' && ch <= 'Z') {
                    ans = ans + (char) (s.charAt(i) + 32); 
                }
                else{
                    ans = ans + ch;
                }
                
            // if ch isnt a letter, add it to the string    
            } else {
                ans = ans + ch;
            }
            
            i++;
        }

        return ans;
    }
}