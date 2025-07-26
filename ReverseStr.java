import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder ans = new StringBuilder("");

        /*
         * for (int i = str.length() - 1; i >= 0; i--) {
         * ans = ans.append(str.charAt(i));
         * }
         * System.out.println(ans);
         * 
         * ans.reverse();
         */

        int l = 0, r = str.length() - 1;
        char[] temp = new char[r + 1];
        while (l <= r) {
            temp[l] = str.charAt(r);
            temp[r] = str.charAt(l);
            l++;
            r--;
        }
        for (char ch : temp) {
            ans = ans.append(ch);
        }
        System.out.println(ans);

    }
}
