import java.util.Scanner;

public class BinaryMat {
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

        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if (nums[i][j] % 2 != 0) {
                    cnt++;
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
            count[i] = cnt;

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Row " + (i + 1) + " : " + count[i]);
        }
    }
}
