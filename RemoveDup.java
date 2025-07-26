import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String dup = "";

        for (int i = 0; i < str.length(); i++) {

            if (dup.indexOf(str.charAt(i)) == -1) {
                dup += str.charAt(i);
            }
        }

        System.out.println(dup);

    }
}
