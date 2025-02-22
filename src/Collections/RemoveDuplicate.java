package Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//LinkedList is wont accept duplicates and not index based
		LinkedHashSet<Integer> A1 = new LinkedHashSet<Integer>(Arrays.asList(8,9,5,2,6,9));
		System.out.println(A1);
	}
}
