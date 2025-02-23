package String;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.toLowerCase().split("\\s+");

        TreeMap<String, Integer> wordCount = new TreeMap<>(); // TreeMap keeps keys sorted

        for (String word : words) {
            word = word.replaceAll("[^a-z]", ""); // Remove punctuation
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("\nSorted Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

    }
}
