import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int l = nums[0];
        int s = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (i < n / 2 && nums[i] > l) {
                l = nums[i];
            } else if (nums[i] < s) {
                s = nums[i];
            }
        }

        System.out.println(l - s);
    }
}
