package String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Level";
        
        if (isPalindrome(str.toLowerCase())) {
            System.out.println("The String is a palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
