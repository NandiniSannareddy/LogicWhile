import java.util.Scanner;

public class AlternateSum {
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

        int sum = 0;

        for (int i = 0; i < n; i += 2) {
            sum += nums[i][0] + nums[i][m - 1];
        }

        System.out.println(sum);
    }
}
