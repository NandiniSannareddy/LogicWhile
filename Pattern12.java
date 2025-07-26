import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    System.out.print((char) (n - i + 1 + 64) + " ");
                } else if (j == i) {
                    System.out.print('A' + " ");
                } else if (i == 1) {
                    System.out.print((char) (j + 64) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
