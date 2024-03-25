public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int length = 200;
        int width = 50;
        int height = 800;
        int mass = 50;

        System.out.println(solution.categorizeBox(length, width, height, mass));
    }
}
