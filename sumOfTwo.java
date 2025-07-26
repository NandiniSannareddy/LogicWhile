import java.util.Scanner;

class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Sum of " + a + " and " + b + " is " + (a + b));

            System.out.println("Do you want to continue (y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                break;
            }
        }
    }
}
