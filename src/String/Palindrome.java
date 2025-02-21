package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine().toLowerCase();
		
		String res = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			res += str.charAt(i);
		}
		if (str.equals(res)) {
			System.out.println("The String is Palindrom");
		}else {
			System.out.println("The String is not a Palindrome");
		}
	}
}


