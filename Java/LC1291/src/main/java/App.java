import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        int low = 100;
//        int high = 300;
//        List<Integer> expected = List.of(123, 234);
//        List<Integer> result = solution.sequentialDigits(low, high);
//
//        System.out.println("Expected:");
//        System.out.println(expected);
//        System.out.println("Result:");
//        System.out.println(result + " -> " + Arrays.equals(result.toArray(), expected.toArray()));
//
//        low = 1000;
//        high = 13000;
//        expected = List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345);
//        result = solution.sequentialDigits(low, high);
//
//        System.out.println("Expected:");
//        System.out.println(expected);
//        System.out.println("Result:");
//        System.out.println(result + " -> " + Arrays.equals(result.toArray(), expected.toArray()));

        int low = 58;
        int high = 155;

        List<Integer> expected = List.of(67, 78, 89, 123);
        List<Integer> result = solution.sequentialDigits(low, high);

        System.out.println("Expected:");
        System.out.println(expected);
        System.out.println("Result:");
        System.out.println(result + " -> " + Arrays.equals(result.toArray(), expected.toArray()));
    }
}
