package Arrays;

import java.util.Arrays;

public class UnsortedNum {

	public static void main(String[] args) {
		
		int arr[] = {5,6,2,5,7,9};
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+ " ");
		}
	}
}
