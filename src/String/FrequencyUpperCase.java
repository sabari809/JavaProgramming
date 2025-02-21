package String;

import java.util.Scanner;

public class FrequencyUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
	
		String str = sc.nextLine();
		
		int arr[] = new int[128];
		
		for (int i = 0; i < str.length(); i++) {
			
			
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90 ) {
			
				int ch = str.charAt(i);
					
				arr[ch]++;
			}
		}
		
		for (int i = 65; i <= 90; i++) {
			
			 if (arr[i]> 0) {
				System.out.println( (char) i  + " " + arr[i] );
			}
		}
	}
}
