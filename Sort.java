import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        /*
         * for (int i = 0; i < n - 1; i++) {
         * int mini = i;
         * for (int j = i + 1; j < n; j++) {
         * if (nums[j] < nums[mini]) {
         * mini = j;
         * }
         * }
         * int temp = nums[mini];
         * nums[mini] = nums[i];
         * nums[i] = temp;
         * }
         */

        // Arrays.sort(nums);

        for (int i = 0; i < n / 2 - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n / 2; j++) {

                if (nums[j] < nums[mini]) {
                    mini = j;
                }
            }
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }

        for (int i = n / 2; i < n; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[mini]) {
                    mini = j;
                }
            }
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
