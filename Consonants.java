import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.next());

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'A' && str.charAt(i) != 'a' && str.charAt(i) != 'E' && str.charAt(i) != 'e'
                    && str.charAt(i) != 'I' && str.charAt(i) != 'i' && str.charAt(i) != 'O' && str.charAt(i) != 'o'
                    && str.charAt(i) != 'U' && str.charAt(i) != 'u') {
                cnt++;
                System.out.println(str.charAt(i));
            }
        }

        System.out.println("Total: " + cnt);
    }

}
