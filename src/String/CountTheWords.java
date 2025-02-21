package String;

public class CountTheWords {

	public static void main(String[] args) {
		
	int count = 0;
	
	String str = "I love idli vada dosa puri";
	
	String s1[]=str.split(" ");
	
	for (int i = 0; i < s1.length; i++) {
		count ++;
	}

	System.out.println(count);
}}
