import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] ans = new int[n];

        int j = 0;
        for (int i = 0; i < m; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + m];
        }

        System.out.println(Arrays.toString(ans));

    }
}
