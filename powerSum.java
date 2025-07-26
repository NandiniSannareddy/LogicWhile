import java.util.Scanner;
import java.lang.Math;

public class powerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         * int cnt = 0;
         * int sum = 0;
         * while (n != 0) {
         * cnt++;
         * int rem = n % 10;
         * sum += Math.pow(rem, cnt);
         * n /= 10;
         * }
         * 
         * System.out.println(sum);
         */
        int cnt = ((int) Math.log10(n)) + 1;
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, cnt);
            n /= 10;
            cnt--;
        }

        System.out.println(sum);

    }
}
