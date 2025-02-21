package String;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "i love idli vada dosa puri";  
        
        String[] words = str.split(" ");
        
        String res = "";

        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i] + " ";
        }
        
        System.out.println(res.trim());
    }
}
