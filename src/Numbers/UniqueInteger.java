package Numbers;

import java.util.Scanner;

public class UniqueInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int no = sc.nextInt();
		
		String res = String.valueOf(no);
		
		int arr[] = new int[128];
		
		for (int i = 0; i < res.length(); i++) {
			
			arr[res.charAt(i)]++;
		}
		
		for (int i = '0'; i < '9'; i++) {
			if (arr[i]==1) {
				System.out.println( (char)i + " The Number is Unique Number");
			}
		}
	}
}
