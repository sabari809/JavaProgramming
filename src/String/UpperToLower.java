package String;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
	
		String res = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>= 'a' && str.charAt(i)<='z' ) {
				res += (char)(str.charAt(i)-32);
			} else {
				res += (char)(str.charAt(i)+32); 
			}
			
		}
		
		System.out.println(res);
	}
}
