package String;

import java.util.TreeSet;

public class Panagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		
		String s1 = str.toLowerCase().replaceAll(" ", "");
		
		TreeSet<Character> T1 = new TreeSet<Character>();
		
		
		for (int i = 0; i < s1.length(); i++) {
			T1.add(s1.charAt(i));
		}
		System.out.println(T1.size() == 26 ? "The String is Panagram" : "The String is Not Panagram");
	}
}
