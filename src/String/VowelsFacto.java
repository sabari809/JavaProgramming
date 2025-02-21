package String;

import java.util.Scanner;

public class VowelsFacto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Word");
		
		String str = sc.nextLine();
		
		String sr = str.replaceAll("[aeiou]", "");
		
		int count = 0;
		
		for (int i = 0; i < sr.length(); i++) {
			count ++;
		}
				System.out.println(count);
	}
}
