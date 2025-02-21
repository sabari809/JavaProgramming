package Numberswapping;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int no = sc.nextInt();
		
		int last = no % 1000;
		
		int first = no / 1000;
		
		int rev = 0;
		
		while (last!=0) {
			rev = rev * 10 + last % 10;
			last /= 10;
		}
	
		System.out.println(first+""+rev);
	}
}
