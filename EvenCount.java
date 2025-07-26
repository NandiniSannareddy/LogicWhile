import java.util.Scanner;
import java.lang.Math;

public class EvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int dig = (int) Math.log10(nums[i]) + 1;
            if (dig % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
