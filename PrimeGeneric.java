import java.util.Scanner;

public class PrimeGeneric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n > 9) {
            int num = 0;
            int temp = n;
            while (temp != 0) {
                int rem = temp % 10;
                num += rem;
                temp /= 10;
            }
            n = num;
        }

        if (n == 1) {
            System.out.println("Magic number");
        } else {
            System.out.println("Generic number");
        }
    }
}
