package Numbers;

import java.util.Scanner;

public class PrefectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int no = sc.nextInt();

		int sum = 0;
		
		for (int i = 1; i <= no / 2; i++) {
            if (no % i == 0) {
                sum += i; 
            }	
            
		}
        
		System.out.println(sum==no ? "The Number is prefect Number" : "The number is not a perfect Number");
		
}
}