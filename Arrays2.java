import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int odd = 0, even = 0;
        for (int val : nums) {
            if (val % 2 != 0) {
                odd += val;
            } else {
                even += val;
            }
        }

        System.out.println("odd sum - even sum: " + (odd - even));

        odd = 0;
        even = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }

        System.out.println("even sum - odd sum: " + (even - odd));

    }
}
