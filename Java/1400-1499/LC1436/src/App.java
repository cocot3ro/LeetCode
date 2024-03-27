import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<String>> paths = List.of(
            List.of("London", "New York"),
            List.of("New York", "Lima"),
            List.of("Lima", "Sao Paulo")
        );

        System.out.println(solution.destCity(paths));
    }
}
