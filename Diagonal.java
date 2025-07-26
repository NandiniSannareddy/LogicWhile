import java.util.Scanner;

public class Diagonal {
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

        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == n - 1) {
                    if (nums[i][j] < mini) {
                        mini = nums[i][j];
                    }
                } else {
                    if (nums[i][j] > maxi) {
                        maxi = nums[i][j];
                    }
                }
            }
        }

        System.out.println(maxi - mini);

    }
}
