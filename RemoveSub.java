import java.util.Scanner;

public class RemoveSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String remove = sc.next();

        String ans = str.replaceAll(remove, "");
        /*
         * int i = 0;
         * while (i <= str.length() - remove.length()) {
         * if (str.substring(i, i + remove.length()).equals(remove)) {
         * i += 2;
         * } else {
         * ans += str.charAt(i);
         * i++;
         * }
         * }
         * 
         * while (i < str.length()) {
         * ans += str.charAt(i);
         * i++;
         * }
         */

        System.out.println(ans);
    }
}