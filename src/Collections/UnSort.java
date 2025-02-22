package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UnSort {
	
	public static void main(String[] args) {
		ArrayList A1 = new ArrayList(Arrays.asList(9,5,3,8,1,2));
		
		Collections.sort(A1);
	
		System.out.println(A1);
	}

}
