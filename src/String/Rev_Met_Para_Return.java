package String;

import java.util.Scanner;

public class Rev_Met_Para_Return {

	public static String Palin(String Str) {
		
		
		String res = "";
		
		for (int i = Str.length()-1; i >= 0; i--) {
			res += Str.charAt(i);
		}
		if (Str.equals(res)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println("The String is not a Palindrome");
		}
		
		return res;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String x = Palin(sc.nextLine().toLowerCase());
		
	}
	
}
