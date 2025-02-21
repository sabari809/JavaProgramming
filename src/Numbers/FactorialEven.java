package Numbers;

import java.util.Scanner;

public class FactorialEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int no = sc.nextInt();
		
		int mul = 1;
		
		for (int i = 2; i <= no; i+=2) {
				mul *= i;
		}
		System.out.println(mul);
	}
	
}
