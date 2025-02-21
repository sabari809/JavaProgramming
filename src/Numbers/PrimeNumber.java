package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		boolean flage = true;
		
		int num = sc.nextInt();
		
		if (num < 1) flage = false;
		
		if (num == 2) flage = true;
		
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				flage = false;
			}
		}
		
		System.out.println(flage ? "The number is prime" : "The number is not prime");
	}
}
