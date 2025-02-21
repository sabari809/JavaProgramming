package String;

import java.util.Iterator;
import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		int arr[] = new int[128];
		
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				System.out.println( (char)i + " Unique is Character");
			}
		}
	}
}
