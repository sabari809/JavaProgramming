package Numbers;

import java.util.Scanner;

class Facc {
    public static void fac(int num) { 
        int mul = 1;

        for (int i = num; i > 0; i--) { 
            mul *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + mul);
    }
}

public class FactorialEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int no = sc.nextInt();

        while (no != 0) {
            int rem = no % 10; 
            Facc.fac(rem); 
            no /= 10;
        }
    }
}
