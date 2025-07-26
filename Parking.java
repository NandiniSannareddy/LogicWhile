import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int charge = 0;

        if (a <= 0) {
            System.out.println("Invalid");
        } else if (a <= 2) {
            System.out.println("Total charge is " + 50 + " rupees");
        } else {
            System.out.println("Total charge is " + (50 + (a - 2) * 20) + " rupees");
        }

    }
}
