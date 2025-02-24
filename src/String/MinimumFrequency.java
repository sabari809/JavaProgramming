package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumFrequency {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        String str = sc.nextLine();

        String s1[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE; 

        for (String s : s1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        
        for (int freq : map.values()) {
            min = Math.min(min, freq);
        }

        
        System.out.print("Word(s) with minimum frequency (" + min + "): ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
