import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        nums = Arrays.copyOf(nums, n + m);

        for (int i = 0; i < m; i++) {
            nums[n + i] = arr[i];
        }

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

    }
}
