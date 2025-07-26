import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] > 0) {
                System.out.println(str.charAt(i) + ": " + arr[str.charAt(i)]);
                arr[str.charAt(i)] = 0;
            }

        }

    }
}
