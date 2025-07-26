import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 0;
        int c1 = 1, c2 = 1;

        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                a = rem * c1 + a;
                c1 *= 10;
            } else {
                b = rem * c2 + b;
                c2 *= 10;
            }
            n /= 10;
        }

        int res = a - b;

        System.out.println(res);
    }
}