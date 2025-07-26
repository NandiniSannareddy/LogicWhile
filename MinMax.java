import java.util.Scanner;

public class MinMax {
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

        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i][i] > maxi) {
                maxi = nums[i][i];
            }

            if (nums[i][m - 1 - i] < mini) {
                mini = nums[i][m - 1 - i];
            }
        }

        System.out.println(maxi - mini);
    }
}
