package String;

public class LetterSereis {

	public static void main(String[] args) {
		String str = "asqwe";
		
		String res = "";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			int n = str.charAt(i);
			res += (char)(n+1);
		}
		
		System.out.println(res.toString());
	}
}
