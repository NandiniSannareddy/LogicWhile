import java.util.Arrays;
import java.util.Scanner;

class Heights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        temp = Arrays.copyOf(nums, n);

        Arrays.sort(temp);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (temp[i] != nums[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}