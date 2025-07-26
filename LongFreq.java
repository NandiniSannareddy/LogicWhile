import java.util.Scanner;

public class LongFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int maxi = Integer.MIN_VALUE;
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] > maxi) {
                maxi = arr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }

        System.out.println(ch);
        System.out.println(maxi);

    }
}
