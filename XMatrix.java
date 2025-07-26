import java.util.Scanner;

public class XMatrix {
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
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == n - 1) {
                    if (nums[i][j] == 0) {
                        System.out.println("False");
                        return;
                    }
                } else {
                    if (nums[i][j] != 0) {
                        System.out.println("False");
                        return;
                    }
                }
            }
        }

        System.out.println("True");
    }
}
