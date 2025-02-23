package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(56);
		a1.add(63);
		a1.add(34);
		a1.add(50);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(56);
		a2.add(53);
		a2.add(44);
		a2.add(50);
		a1.removeAll(a2);
		System.out.println(a1);
		
		
 	}
}

// By Using Collection

/*

 int arr[]= {1,2,4,2,4,7,5,9,};
		
		TreeSet<Integer> T1 = new TreeSet<Integer>();
		
		for(int no : arr) {
			T1.add(no);
		}
		System.out.println(T1);
  
 * */
