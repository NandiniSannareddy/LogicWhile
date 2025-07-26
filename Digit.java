import java.util.Scanner;
import java.lang.Math;

class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int n = 0;
        while (s != 0) {
            int rem = s % 10;
            n = n * 10 + rem;
            s /= 10;
        }

        int res = n % 10;
        int prev = res % 10;
        n = n / 10;
        while (n != 0) {
            int rem = n % 10;
            int diff = Math.abs(rem - prev);
            res = res * 10 + diff;
            prev = rem;
            n /= 10;
        }

        System.out.println(res);
    }
}