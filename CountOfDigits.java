import java.util.Scanner;
import java.lang.Math;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        int cnt = 0;
        while (n != 0) {
            int rem = n % 10;
            System.out.println(rem);
            cnt++;
            n /= 10;
        }
        if (cnt == 0 && n == 0) {
            cnt = 1;
        }
        System.out.println("Count of digits: " + cnt);
    }
}
