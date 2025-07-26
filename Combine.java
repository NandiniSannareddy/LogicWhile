import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.next());
        StringBuilder one = new StringBuilder("");
        StringBuilder two = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'A' && str.charAt(i) != 'a' && str.charAt(i) != 'E' && str.charAt(i) != 'e'
                    && str.charAt(i) != 'I' && str.charAt(i) != 'i' && str.charAt(i) != 'O' && str.charAt(i) != 'o'
                    && str.charAt(i) != 'U' && str.charAt(i) != 'u') {
                one.append(str.charAt(i));
            } else {
                two.append(str.charAt(i));
            }
        }

        System.out.println(one);
        System.out.println(two);
    }

}
