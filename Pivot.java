import java.util.Scanner;

public class Pivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int total = 0;
        for (int val : nums) {
            total += val;
        }

        int left = 0;
        for (int i = 0; i < n; i++) {
            if (left == (total - left - nums[i])) {
                System.out.println(i);
                return;
            }
            left += nums[i];
        }
        System.out.println(-1);
    }
}
