package Pattern;

import java.util.Scanner;

public class X_Pattern {

	 public static void main(String[] args) {
	     Scanner Sc=new Scanner(System.in);
	     System.out.println("Enter the String : ");
	     String Str=Sc.nextLine();
	     System.out.println("----------------------------");   
	      
	        for (int i = 0; i < Str.length(); i++) {
	          
	            for (int j = 0; j < Str.length(); j++) {
	                
	                
	                if (i == j) {
	                    System.out.print(Str.charAt(i));
	                }
	                
	                else if (i + j == Str.length() - 1) {
	                    System.out.print(Str.charAt(j));
	                } 
	                
	                else {
	                    System.out.print(" ");
	                }
	            }
	            
	            System.out.println();
	        }
	    }
}
