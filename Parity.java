import java.util.Arrays;
import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                ans[left++] = nums[i];
            } else {
                ans[right--] = nums[i];
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
