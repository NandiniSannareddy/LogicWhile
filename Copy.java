import java.util.Scanner;

public class Copy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if ("aeiouAEIUO".indexOf(str.charAt(i)) != -1) {
                for (int j = 1; j < i + 1; j++) {
                    res += str.charAt(i);
                }
            }
            res += str.charAt(i);

        }

        System.out.println(res);
    }
}