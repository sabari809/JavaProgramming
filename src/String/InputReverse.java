package String;

public class InputReverse {

	public static void main(String[] args) {
		String input = "Programming"; //output : progrgnimma
		
		String start  = input.substring(0, 5);
		String end  = input.substring(5);
		
		String res = "";
		
		for (int i = end.length()-1; i >= 0; i--) {
			res += end.charAt(i);
		}
		
		System.out.println(start + res);
	}
}
