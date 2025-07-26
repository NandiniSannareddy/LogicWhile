import java.util.Scanner;

public class Mirrored {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Can't form a mirrored image . size should be even");
            return;
        }
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }

        boolean res = find(n, nums);

        if (res) {
            System.out.println("It's a mirrored array");
        } else {
            System.out.println("Not a mirored array");
        }
    }

    public static boolean find(int n, int[] nums) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[n - i - 1])
                return false;
        }
        return true;
    }
}
