package Numbers;

import java.util.Iterator;
import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Number: ");
	        int n = sc.nextInt(), count = 0, num = 1;

	        while (count < n) 
	            if (isPrime(++num)) count++;

	        System.out.println(n + "th prime: " + num);
	    }

	    private static boolean isPrime(int num) {
	        for (int i = 2; i * i <= num; i++) 
	            if (num % i == 0) return false;
	        return num > 1;
	    }
	}

