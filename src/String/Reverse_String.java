package String;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Word");
		
		String res = "";
		
		String str = sc.nextLine().toLowerCase();
		
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(res+str.charAt(i));
		}
	}
	
}
