import java.util.Arrays;
import java.util.Scanner;

public class WordsInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        /*
         * String res = "" + Character.toUpperCase(str.charAt(0));
         * 
         * for (int i = 1; i < str.length(); i++) {
         * if (str.charAt(i - 1) == ' ') {
         * res += Character.toUpperCase(str.charAt(i));
         * } else {
         * res += str.charAt(i);
         * }
         * }
         */

        String[] temp = str.split(" ");
        // System.out.println(Arrays.toString(temp));
        String res = "";

        for (int i = 0; i < temp.length; i++) {
            char t = Character.toUpperCase(temp[i].charAt(0));
            res += t + temp[i].substring(1) + " ";
        }
        System.out.println(res);
    }
}
