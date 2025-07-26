import java.util.*;

class Dsa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int five = a / 500;
        a %= 500;
        int two = a / 200;
        a %= 200;
        int one = a / 100;

        if (five > 0) {
            System.out.println("500 notes are: " + five);
        }

        if (two > 0) {
            System.out.println("200 notes are: " + two);
        }
        if (one > 0) {
            System.out.println("100 notes are: " + one);
        }

    }
}