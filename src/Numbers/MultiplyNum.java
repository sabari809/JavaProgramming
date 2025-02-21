package Numbers;

import java.util.Scanner;

public class MultiplyNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	int no = sc.nextInt();
	
	int mul = 1;
	
	while (no!=0) {
		int rem = no % 10;
		
		mul *= rem;
		
		no /= 10;
	}
	System.out.println(mul);
}
}
