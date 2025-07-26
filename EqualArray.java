import java.util.Scanner;

public class EqualArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        boolean res = find(a, b);

        if (res) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }
    }

    public static boolean find(int[] num1, int[] num2) {
        if (num1.length != num2.length)
            return false;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i])
                return false;
        }

        return true;
    }
}
