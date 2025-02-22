package Arrays;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		int arr[]= {7,0,5,3,9,2};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int no = sc.nextInt();
		
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==no) {
				index = i;
				break;
			} 
			
		} 
		
		if (index!=-1) {
			
			System.out.println("The Number is Present " + index);
		} else {

			System.out.println("The Number is not Present");
		}
	
		
	}
}
