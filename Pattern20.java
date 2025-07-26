import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if ((j == i || j == 2 * n - i) && i <= n) {
                    System.out.print((n - i + 1) + " ");
                } else if (j == i || j == 2 * n - i) {
                    System.out.print((i - n + 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
