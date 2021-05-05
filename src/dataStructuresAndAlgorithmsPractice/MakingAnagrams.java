package dataStructuresAndAlgorithmsPractice;

public class MakingAnagrams {
    static int makeAnagram(String a, String b) {
        int minDeletions = 0;
        int[] aFrequencies = new int[26];
        int[] bFrequencies = new int[26];

        for(int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            int position = (int)currentChar - (int)'a';
            aFrequencies[position]++;
        }

        for(int i = 0; i < b.length(); i++) {
            char currentChar = b.charAt(i);
            int position = (int)currentChar - (int)'a';
            bFrequencies[position]++;
        }

        for(int i = 0; i < 26; i++) {
            int difference = Math.abs(aFrequencies[i] - bFrequencies[i]);
            minDeletions += difference;
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("cde", "abc")); //4
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")); //30
    }
}