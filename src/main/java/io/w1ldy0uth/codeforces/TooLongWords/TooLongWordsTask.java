package io.w1ldy0uth.codeforces.TooLongWords;

import java.util.*;

public class TooLongWordsTask {
    // Auxiliary method for running on codeforces.com. Use solve() method for testing 
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int wordsNumber = sc.nextInt();
        List<String> output = new ArrayList<String>();

        for (int i = 0; i < wordsNumber; i++) {
            String word = sc.next();
            if (word.length() > 10) {
                output.add(word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                output.add(word);
            }
        }
        sc.close();

        for (String word : output) {
            System.out.println(word);
        }
    }
}
