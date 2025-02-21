package String;

class reverse{
	
	public static void rev(String str) {
		
		String res = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			res += str.charAt(i);
		}
		
		System.out.print(res+ " ");
		
	}
	
}

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String str = "i evol uoy";
		
		String s1[] = str.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			reverse.rev(s1[i]);
		}
		
	}
}
