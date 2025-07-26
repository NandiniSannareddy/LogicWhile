import java.util.Scanner;

public class DiagonalDiff {
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

        int first = 0, sec = 0;

        for (int i = 0; i < n; i++) {
            first += nums[i][i];
            sec += nums[i][m - 1 - i];
        }

        System.out.println(first - sec);
    }
}
