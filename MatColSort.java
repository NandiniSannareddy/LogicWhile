import java.util.Scanner;

public class MatColSort {
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

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                int mini = nums[i][j];
                int ind = i;
                for (int k = i + 1; k < n; k++) {
                    if (nums[k][j] < mini) {
                        mini = nums[k][j];
                        ind = k;
                    }
                }
                int temp = nums[i][j];
                nums[i][j] = nums[ind][j];
                nums[ind][j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
