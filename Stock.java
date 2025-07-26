import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        /*
         * int[] temp = new int[n];
         * for (int i = 0; i < n - 1; i++) {
         * for (int j = i + 1; j < n; j++) {
         * if (nums[j] - nums[i] > temp[i]) {
         * temp[i] = nums[j] - nums[i];
         * }
         * }
         * }
         * 
         * int maxi = Integer.MIN_VALUE;
         * 
         * for (int i = 0; i < temp.length; i++) {
         * if (temp[i] > maxi)
         * maxi = temp[i];
         * }
         */

        int mini = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < mini) {
                mini = nums[i];
            } else if (nums[i] - mini > profit) {
                profit = nums[i] - mini;
            }
        }

        System.out.println(profit);
    }
}
