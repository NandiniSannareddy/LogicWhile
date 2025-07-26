import java.util.Scanner;

public class Teoplitz {
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

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (nums[i][j] != nums[i + 1][j + 1]) {
                    System.out.println("False");
                    return;
                }
            }
        }

        System.out.println("True");
    }
}
