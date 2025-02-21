package String;

public class Vowels {

	public static void main(String[] args) {
		String str = "programming";
		
		String res = str.replaceAll("[^AEIOUaeiou]", "");
		System.out.println(res);
	}
}
