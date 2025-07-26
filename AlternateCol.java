import java.util.Scanner;

public class AlternateCol {
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
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j -= 2) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

}
