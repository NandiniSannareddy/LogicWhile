import java.util.Arrays;
import java.util.Scanner;

public class ShiftZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                cnt++;
            else {
                ans[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            ans[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(ans));

    }
}
