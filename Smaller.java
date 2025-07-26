import java.util.Arrays;
import java.util.Scanner;

public class Smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int dig = nums[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < dig)
                    cnt++;
            }
            ans[i] = cnt;
        }

        System.out.println(Arrays.toString(ans));
    }
}
