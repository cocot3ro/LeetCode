public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr;

        arr = new int[]{1, 2, 2, 1, 1, 3};
        System.out.println("true -> " + solution.uniqueOccurrences(arr));

        arr = new int[]{1, 2};
        System.out.println("false -> " + solution.uniqueOccurrences(arr));

        arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println("true -> " + solution.uniqueOccurrences(arr));
    }
}
