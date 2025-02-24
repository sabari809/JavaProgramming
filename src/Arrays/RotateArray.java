package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rotations:");
        int k = sc.nextInt();

        int arr[] = {0, 1, 2, 3, 4, 5, 6};
        int n = arr.length;
    
        k = k % n;

        int rotatedArr[] = new int[n];

     
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i];
        }

        
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}