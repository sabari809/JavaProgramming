package Intermidiate;

import java.util.Scanner;

public class SwitchCas {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();
		
		switch (month) {
		
			case 12:
			case 1:
			case 2:
		  System.out.println("This is Winter Season");
		  break;
		  
			case 3:
			case 4:
			case 5:
				System.out.println("This is summer season");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("This is spring season");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println("This is Autumn  season");
				break;
				
				
		}
		
	}
}
