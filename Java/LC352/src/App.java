import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        SummaryRanges summaryRanges = null;

        String[] dataStream = { "SummaryRanges", "addNum", "getIntervals", "addNum", "getIntervals", "addNum",
                "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum",
                "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals" };
        int[][] values = { {}, { 6 }, {}, { 6 }, {}, { 0 }, {}, { 4 }, {}, { 8 }, {}, { 7 }, {}, { 6 }, {}, { 4 }, {},
                { 7 }, {}, { 5 }, {} };

        for (int i = 0; i < dataStream.length; i++) {
            switch (dataStream[i]) {
                case "SummaryRanges":
                    summaryRanges = new SummaryRanges();
                    break;
                case "addNum":
                    summaryRanges.addNum(values[i][0]);
                    System.out.println("add: " + values[i][0]);
                    break;
                case "getIntervals":
                    int[][] intervals = summaryRanges.getIntervals();
                    System.out.print("get intervals: ");
                    for (int[] interval : intervals) {
                        System.out.print(Arrays.toString(interval));
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
