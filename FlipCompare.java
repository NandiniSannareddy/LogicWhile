import java.util.Scanner;

public class FlipCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num1 = 0;
        while (a != 0) {
            int rem = a % 10;
            num1 = num1 * 10 + rem;
            a /= 10;
        }

        int num2 = 0;
        while (b != 0) {
            int rem = b % 10;
            num2 = num2 * 10 + rem;
            b /= 10;
        }

        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else {
            System.out.println(num2 + " is greater");
        }
    }
}
