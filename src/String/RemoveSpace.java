package String;

public class RemoveSpace {
    
    public boolean isPalindrome(String str) {
        
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {  
        String str = "A man, a plan, a canal: Panama";

        RemoveSpace r = new RemoveSpace();

        if (r.isPalindrome(str)) {
            System.out.println("The String is a palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }
    }
}

/* with inbuild method  
 * 
 * 
 package String;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        
        String reversedStr = new StringBuilder(str).reverse().toString();
        
     
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        if (isPalindrome(str)) {
            System.out.println("The String is a palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }
    }
}
 */
