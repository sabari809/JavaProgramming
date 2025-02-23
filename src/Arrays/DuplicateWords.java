package Arrays;

import java.util.TreeSet;

public class DuplicateWords {

	public static void main(String[] args) {
		
		String str = "Hai Hai How Are You Are";
		
		String s1[] = str.split(" ");
		
		TreeSet<String> A1 = new TreeSet<String>();
		
		for (String string : s1) {
			A1.add(string + " ");
		}
		
		System.out.println(A1);
	}
}
