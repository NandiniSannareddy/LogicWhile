import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ind = Arrays.binarySearch(nums, 9);

        System.out.println(ind);

        /*
         * Arrays.sort(nums);
         * System.out.println(Arrays.toString(nums));
         */

        /*
         * int m = sc.nextInt();
         * int[] arr = new int[n];
         * 
         * for (int i = 0; i < m; i++) {
         * arr[i] = sc.nextInt();
         * }
         * 
         * System.out.println(Arrays.equals(nums, arr));
         */

        // int[] arr = Arrays.copyOf(nums, nums.length);
        // int[] arr = Arrays.copyOfRange(nums, 2, nums.length);
        /*
         * int[] arr = new int[10];
         * Arrays.fill(arr, 100);
         * System.out.println(Arrays.toString(arr));
         */

    }
}
