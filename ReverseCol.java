import java.util.Arrays;
import java.util.Scanner;

public class ReverseCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] nums = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = nums[i][j];
                nums[i][j] = nums[n - 1 - i][j];
                nums[n - 1 - i][j] = temp;
            }
        }

        for (int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }
    }
}
