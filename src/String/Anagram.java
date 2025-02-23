package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ener the First Word");
		
		String s1 = sc.nextLine().toLowerCase();
		
		System.out.println("Ener the Second Word");
		
		String s2 = sc.nextLine().toLowerCase();
		
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println(Arrays.equals(ch1, ch2) ? "The String is Anagram" : "Not a anagram");
		
		}
		
	}

}
