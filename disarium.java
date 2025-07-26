import java.util.Scanner;
import java.lang.Math;

public class disarium {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int digit = i;
            int cnt = ((int) Math.log10(digit)) + 1;
            int sum = 0;
            while (digit != 0) {
                int rem = digit % 10;
                sum += Math.pow(rem, cnt);
                cnt--;
                digit /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
