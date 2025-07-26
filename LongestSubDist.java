import java.util.*;

public class LongestSubDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String longest = "";
        String curr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (curr.indexOf(ch) != -1) {
                curr = curr.substring(curr.indexOf(ch) + 1);
            }
            curr += ch;
            if (curr.length() > longest.length()) {
                longest = curr;
            }
        }

        System.out.println(longest);
    }
}
