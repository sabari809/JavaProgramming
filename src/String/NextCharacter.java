package String;

public class NextCharacter {

	public static void main(String[] args) {
		String str = "hello";
		
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			res.append((char) (ch+4) );
			
		}
		System.out.println(res.toString());
	}
}

