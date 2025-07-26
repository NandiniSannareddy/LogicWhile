import java.util.Scanner;

public class ReplaceVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer str = new StringBuffer(sc.next());

        for (int i = 0; i < str.length(); i++) {
            if ("aeiouAEIOU".indexOf(str.charAt(i)) != -1) {
                str.replace(i, i + 1, "@");
            }
        }

    }
}
