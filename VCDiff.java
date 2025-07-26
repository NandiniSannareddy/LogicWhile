import java.util.Scanner;

public class VCDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int l = 0, r = str.length() - 1;

        int v1 = 0, v2 = 0;
        while (l < r) {
            if ("aeiouAEIOU".indexOf(str.charAt(l)) != -1) {
                v1++;
            }
            if ("aeiouAEIOU".indexOf(str.charAt(r)) != -1) {
                v2++;
            }
            l++;
            r--;
        }
        if ("aeiouAEIOU".indexOf(str.charAt(r)) != -1 && l == r) {
            v2++;
        }

        System.out.println(Math.abs(v1 - v2));
    }
}
