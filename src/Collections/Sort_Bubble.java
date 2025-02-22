package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Bubble {

	public static void main(String[] args) {
		ArrayList<Integer> A1 = new ArrayList<Integer>(Arrays.asList(9,5,3,8,1,2));
		
		for (int i = 0; i < A1.size(); i++) {
			for (int j = 0; j < A1.size()-1-i; j++) {
				if (A1.get(j) > A1.get(j+1)) {
					int temp = A1.get(j);
					A1.set(j, A1.get(j+1));
					A1.set(j+1, temp);
				}
			}
		}
		System.out.println(A1);
	}
}
