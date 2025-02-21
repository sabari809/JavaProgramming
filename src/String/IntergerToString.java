package String;

import java.util.Scanner;

public class IntergerToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Interger");
		
		int num = sc.nextInt();
		
		String str =  String.valueOf(num);
		
		int arr[] = new int[128];
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		
		for (int i = '0'; i <= '9'; i++) {
			if (arr[i]>0) {
				System.out.println( (char)i + " " + arr[i] );
			} 
		}
	}
}
