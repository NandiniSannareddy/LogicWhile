import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        prefix[1] = nums[0];

        for (int i = 2; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        System.out.println(Arrays.toString(prefix));
    }
}
