package Numbers;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int first = sc.nextInt();

        System.out.print("Enter B: ");
        int second = sc.nextInt();

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After swapping:");
        System.out.println("A: " + first);
        System.out.println("B: " + second);

    
    }
}
