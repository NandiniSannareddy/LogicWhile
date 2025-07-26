import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int i = 1;
        while (i < n) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
            i += 4;
        }

        System.out.println(Arrays.toString(nums));
    }
}
