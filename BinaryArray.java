import java.util.Arrays;
import java.util.Scanner;

public class BinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] % 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
