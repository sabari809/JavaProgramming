package String;

 class mainclass {

    public static void palin(String str) {
        String reversed = "";

   
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

       
        if (str.equalsIgnoreCase(reversed)) {
            System.out.print(str+" ");
        }
    }
}

 public class PalindromeWords {
    public static void main(String[] args) {
        String str = "My mom said to learn malayalam but I am from katak place it is in gadag";

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) { 
        	mainclass.palin(words[i]);
        }
    }
}
