package String;

import java.util.TreeSet;

public class VowelSentence {

    public static void main(String[] args) {
        String str = "Abstract Education Facetious Aeuious system presented";

        String[] words = str.split(" "); 

        for (String word : words) {
            checkVowels(word);
        }
    }

    private static void checkVowels(String word) {
        String vowelsOnly = word.replaceAll("(?i)[^aeiou]", "");

        TreeSet<Character> vowelSet = new TreeSet<>();

        for (char ch : vowelsOnly.toCharArray()) {
            vowelSet.add(Character.toLowerCase(ch)); 
        }

        if (vowelSet.size() == 5) { 
            System.out.println(word);
        }
    }
}
