package Numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int no = sc.nextInt();
		
		int mul = 1;
		
		for (int i = 1; i <= no; i++) {
			mul *= i;
		}
	
		System.out.println(mul);
	}
}
