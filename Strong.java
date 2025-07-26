import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i;

            int res = 0;

            while (temp != 0) {
                int rem = temp % 10;
                int fact = 1;
                for (int k = 1; k <= rem; k++) {
                    fact *= k;
                }
                res += fact;
                temp /= 10;
            }

            if (res == i) {
                System.out.println(i);
            }
        }

    }
}
