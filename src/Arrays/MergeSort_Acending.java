package Arrays;

import java.util.Arrays;

public class MergeSort_Acending {

	public static void main(String[] args) {
		int a1[] = {1,7,3,9};
		int a2[] = {6,5,2,8};
		
		int temp[] = new int[a1.length + a2.length];
		
		System.arraycopy(a1, 0, temp, 0, a1.length);
		
		System.arraycopy(a2, 0, temp, a1.length, a2.length);
		
		Arrays.sort(temp);
		
		System.out.println(Arrays.toString(temp));
	}
}
