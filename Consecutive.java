import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxi = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                curr++;
            } else {
                if (curr > maxi) {
                    maxi = curr;
                }
                curr = 0;
            }
        }
        if (curr > maxi) {
            maxi = curr;
        }

        System.out.println(maxi);
    }
}
