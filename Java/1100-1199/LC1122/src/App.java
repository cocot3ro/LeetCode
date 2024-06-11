import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};

        System.out.println(Arrays.toString(solution.relativeSortArray(arr1, arr2)));
    }
}