import java.util.*;

public class Arrays1 {
    public static void main(String[] args) {
        /*
         * // String str = "Java Program";
         * int[] nums = new int[9];
         * // boolean res = str instanceof String;
         * boolean res = nums instanceof int[];
         * System.out.println(res);
         */

        Scanner sc = new Scanner(System.in);
        int[] nums = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print(Arrays.toString(nums));

    }
}
