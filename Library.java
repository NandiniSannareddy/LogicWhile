import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Invalid");
        } else if (a <= 5) {
            System.out.println("Total fine is " + (2 * a) + " rupees");
        } else if (a <= 10) {
            System.out.println("Total fine is " + (10 + (3 * (a - 5))) + " rupees");
        } else {
            System.out.println("Total fine is " + (25 + (5 * (a - 10))) + " rupees");
        }
    }
}
