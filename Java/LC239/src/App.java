import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/input.txt"));
        Solution solution = new Solution();

        int[] nums = new int[100000];
        int i = 0;
        while (sc.hasNext()) {
            nums[i++] = sc.nextInt();
        }

        int k = 50000;

        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums, k)));
    }
}
