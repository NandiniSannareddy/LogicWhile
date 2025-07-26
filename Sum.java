import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            s += nums[i];
            System.out.print(s + " ");
        }
    }
}
