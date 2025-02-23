package Intermidiate;

import java.util.Scanner;

public class ParkingFee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Hours (0-23):");
        int hours = sc.nextInt();

        System.out.println("Enter the Minutes (0-59):");
        int minutes = sc.nextInt();

        if (hours < 0 || hours > 23) {
            System.out.println("-1");
            return;
        }
        if (minutes < 0 || minutes > 59) {
            System.out.println("-2");
            return;
        }

        int totalMinutes = (hours * 60) + minutes;
        int fee = calculateParkingFee(totalMinutes);

        System.out.println("Parking Fee: ₹" + fee);
    }

    private static int calculateParkingFee(int totalMinutes) {
        if (totalMinutes <= 15) {
            return 0;
        } else if (totalMinutes <= 120) {
            return 10;
        } else if (totalMinutes <= 320) {
            return 20;
        } else {
            int extraHours = (totalMinutes - 320 + 59) / 60;
            return 20 + (extraHours * 5);
        }
    }
}
