package String;

import java.util.Scanner;


class Upper{
	public static void upp(String str) {

		String s2 = str.substring(0, 1).toUpperCase();
		
		String s3 = str.substring(1);
		
		System.out.print(s2+s3+" ");
		
	}
}

public class FirsrWordUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		String s1[] = str.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			String s = s1[i];
			
			Upper.upp(s);
		}
	}
}
