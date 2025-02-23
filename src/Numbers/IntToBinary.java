package Numbers;

import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	
	int no = sc.nextInt();
	
	String str = "";
	
	while (no!=0) {
		str += no % 2;
		no /= 2;
	}
	
//   Inbuild --->	str= Integer.toBinaryString(no);
	
	System.out.println(str);

}}
