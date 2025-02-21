package Numbers;

import java.util.Iterator;
import java.util.Scanner;

// the total unit * num  sum should be equals to the orginal number
public class AmstrongNumber {

	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number");
//		
//		int num = sc.nextInt() ,  temp = num,  sum = 0 , count = 0;
//		
//		for (int i = num; i !=0 ; i/=10) count ++;
//		
//		for (int n = num ; n != 0 ; n /= 10)
//			sum += Math.pow(n %10, count);
//		
//		System.out.println(num == sum ? "The number is amstrong number" : "The number is not a Amstrong number");
	
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	       int num = sc.nextInt() , temp = num , sum = 0 , count = String.valueOf(num).length();
	       
	       for(int no = num ; no != 0 ; no /= 10)
	    	   sum += Math.pow(no % 10, count );
	        
	       System.out.println(sum==temp ? "It is amstrong number " : "Not a Amstrong number");
	        
	        
		
		
	}
}
