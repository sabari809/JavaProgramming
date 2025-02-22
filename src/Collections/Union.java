package Collections;

import java.util.TreeSet;

public class Union {

	public static void main(String[] args) {
		TreeSet<Integer> T1 = new TreeSet<Integer>();
		T1.add(55);
		T1.add(25);
		T1.add(35);
		T1.add(65);
		
		TreeSet<Integer> T2 = new TreeSet<Integer>();
		T2.add(55);
		T2.add(25);
		T2.add(95);
		T2.add(85);
		
		T1.addAll(T2);
		
		System.out.println(T2);
	}
}