import java.util.*;

public class Banking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int exp = sc.nextInt();
        switch (exp) {
            case 1:
                System.out.println("Account creation");
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Initial deposit: ");
                int deposit = sc.nextInt();
                System.out.println("Acccount crwated succesfully");

                break;

            default:
                break;
        }
    }
}