public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] jobDifficulty = {6,5,4,3,2,1};
        int d = 2;

        System.out.println(solution.minDifficulty(jobDifficulty, d));
    }
}
