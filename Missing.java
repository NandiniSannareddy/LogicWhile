import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        int xor1 = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            xor1 ^= nums[i];
        }

        for (int i = 0; i <= n; i++) {
            xor1 ^= i;
        }

        System.out.println(xor1);
    }
}
