import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int cnt = 0;

        for (int k = 1; k <= Integer.MAX_VALUE; k++) {
            int sum = 0;

            for (int i = 1; i < k; i++) {
                if (k % i == 0) {
                    sum += i;
                }
            }

            if (sum == k) {
                cnt++;
                // System.out.println(cnt + " th number: " + k);
            }
            if (cnt == n) {

                System.out.println(cnt + " th number: " + k);
                break;
            }
        }

    }
}
