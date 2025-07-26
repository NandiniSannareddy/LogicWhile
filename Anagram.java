import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w1 = sc.next();
        String w2 = sc.next();

        char[] word1 = w1.toCharArray();
        char[] word2 = w2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        if (word1.length != word2.length) {
            System.out.println("Not anagrams");
            return;
        }

        for (int i = 0; i < word1.length; i++) {
            if (word1[i] != word2[i]) {
                System.out.println("Not anagrams");
                return;
            }
        }

        System.out.println("Anagrams");

    }
}
