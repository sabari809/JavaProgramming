package String;

import java.util.Scanner;

public class StringFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		int arr[]  = new int[128];
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				System.out.println( (char)i +" --> " +  arr[i] );
			}
		}
		
	}
}
