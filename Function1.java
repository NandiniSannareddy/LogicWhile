import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }

        esum_osum(n, nums);
    }

    public static void esum_osum(int n, int[] nums) {
        int even = 0, odd = 0;
        for (int val : nums) {
            if (val % 2 == 0) {
                even += val;
            } else {
                odd += val;
            }
        }

        System.out.println(even - odd);
    }
}
