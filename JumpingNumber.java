import java.util.Scanner;
import java.lang.Math;

class JumpingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0 && n < 9) {
            System.out.println("Jumping number");
            return;
        }

        int prev = 0;
        boolean flag = false;
        while (n != 0) {
            int rem = n % 10;
            if (flag && Math.abs(rem - prev) != 1) {
                System.out.println("Not a jumping number");
                return;
            }
            flag = true;
            prev = rem;
            n /= 10;
        }

        System.out.println("Jumping number");

    }
}