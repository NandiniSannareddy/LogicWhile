import java.util.Arrays;
import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i] * nums[i];
        }

        Arrays.sort(ans);

        System.out.println(Arrays.toString(ans));
    }
}
