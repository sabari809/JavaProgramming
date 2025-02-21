package Numbers;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt() , temp = num , sum = 0, count = String.valueOf(num).length();
		
		while (num != 0) {
			int rem = num % 10;
			
			sum += Math.pow(rem, count--);
			
			num /= 10;
			
		}
		
		System.out.println(sum==temp ? "The Number is  Disarium" : "The Number is not Disarium");
	}
}
