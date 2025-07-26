import java.util.Scanner;
import java.lang.Math;

class Balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = (int) Math.log10(n) + 1;

        int stop = cnt / 2;
        int num1 = 0, num2 = 0;
        while (n != 0) {
            int rem = n % 10;
            if (stop > 0) {
                num1 += rem;
                stop--;
            } else if (cnt % 2 != 0 && stop == 0) {
                n /= 10;
                stop--;
                continue;
            } else {
                num2 += rem;
            }
            n /= 10;
        }
        if (num1 == num2) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }
}